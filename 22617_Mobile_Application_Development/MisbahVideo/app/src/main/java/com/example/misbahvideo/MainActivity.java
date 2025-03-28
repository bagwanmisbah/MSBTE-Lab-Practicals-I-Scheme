package com.example.misbahvideo;


import android.app.Activity;
import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends Activity {
    private Camera mCamera;
    private CameraPreview mPreview;
    private MediaRecorder mediaRecorder;
    private Button capture, switchCamera;
    private Context myContext;
    private LinearLayout cameraPreview;
    private boolean cameraFront = false;

    public MainActivity() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        myContext = this;
        initialize();
    }

    private void initialize() {
    }

    private int findFrontFacingCamera() {
        int cameraId = -1;
        // Search for the front facing camera
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i = 0; i < numberOfCameras; i++) {
            CameraInfo info = new CameraInfo();
            Camera.getCameraInfo(i, info);
            if (info.facing == CameraInfo.CAMERA_FACING_FRONT) {
                cameraId = i;
                cameraFront = true;
                break;
            }
        }
        return cameraId;
    }

    private int findBackFacingCamera() {
        int cameraId = -1;
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i = 0; i < numberOfCameras; i++) {
            CameraInfo info = new CameraInfo();
            Camera.getCameraInfo(i, info);
            if (info.facing == CameraInfo.CAMERA_FACING_BACK) {
                cameraId = i;
                cameraFront = false;
                break;
            }
        }
        return cameraId;
    }

    public void onResume() {
        super.onResume();
        if (!hasCamera(myContext)) {
            Toast toast = Toast.makeText(myContext, "Sorry, your phone does not have a camera!", Toast.LENGTH_LONG);
            toast.show();
            finish();
        }
        if (mCamera == null) {
            if (findFrontFacingCamera() 1) {
                releaseCamera();
                chooseCamera();
            } else {
                Toast toast = Toast.makeText(myContext, "Sorry, your phone has only one camera!", Toast.LENGTH_LONG);
                toast.show();
            }
        }
    }

    private void hasCamera(Context myContext) {
    }

    private void chooseCamera() {
    }

    private void releaseCamera() {
    }
};

public void chooseCamera() {
        // if the camera preview is the front
        if (cameraFront) {
        int cameraId = findBackFacingCamera();
        if (cameraId >= 0) {
        // open the backFacingCamera
        // set a picture callback
        // refresh the preview

        mCamera = Camera.open(cameraId);
        // mPicture = getPictureCallback();
        mPreview.refreshCamera(mCamera);
        }
        } else {
        int cameraId = findFrontFacingCamera();
        if (cameraId >= 0) {
        // open the backFacingCamera
        // set a picture callback
        // refresh the preview

        mCamera = Camera.open(cameraId);
        // mPicture = getPictureCallback();
        mPreview.refreshCamera(mCamera);
        }
        }
        }

        @Override
        protected void onPause() {
        super.onPause();
        // when on Pause, release camera in order to be used from other
        // applications
        releaseCamera();
        }

        private boolean hasCamera(Context context) {
        // check if the device has camera
        if (context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)) {
        return true;
        } else {
        return false;
        }
        }

        boolean recording = false;
        OnClickListener captrureListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
        if (recording) {
        // stop recording and release camera
        mediaRecorder.stop(); // stop the recording
        releaseMediaRecorder(); // release the MediaRecorder object
        Toast.makeText(AndroidVideoCaptureExample.this, "Video captured!", Toast.LENGTH_LONG).show();
        recording = false;
        } else {
        if (!prepareMediaRecorder()) {
        Toast.makeText(AndroidVideoCaptureExample.this, "Fail in prepareMediaRecorder()!\n - Ended -", Toast.LENGTH_LONG).show();
        finish();
        }
        // work on UiThread for better performance
        runOnUiThread(new Runnable() {
        public void run() {
        // If there are stories, add them to the table

        try {
        mediaRecorder.start();
        } catch (final Exception ex) {
        // Log.i("---","Exception in thread");
        }
        }
        });

        recording = true;
        }
        }
        };

        private void releaseMediaRecorder() {
        if (mediaRecorder != null) {
        mediaRecorder.reset(); // clear recorder configuration
        mediaRecorder.release(); // release the recorder object
        mediaRecorder = null;
        mCamera.lock(); // lock camera for later use
        }
        }

        private boolean prepareMediaRecorder() {

        mediaRecorder = new MediaRecorder();

        mCamera.unlock();
        mediaRecorder.setCamera(mCamera);

        mediaRecorder.setAudioSource(MediaRecorder.AudioSource.CAMCORDER);
        mediaRecorder.setVideoSource(MediaRecorder.VideoSource.CAMERA);

        mediaRecorder.setProfile(CamcorderProfile.get(CamcorderProfile.QUALITY_720P));

        mediaRecorder.setOutputFile("/sdcard/myvideo.mp4");
        mediaRecorder.setMaxDuration(600000); //set maximum duration 60 sec.
        mediaRecorder.setMaxFileSize(50000000); //set maximum file size 50M

        try {
        mediaRecorder.prepare();
        } catch (IllegalStateException e) {
        releaseMediaRecorder();
        return false;
        } catch (IOException e) {
        releaseMediaRecorder();
        return false;
        }
        return true;

        }

        private void releaseCamera() {
        // stop and release camera
        if (mCamera != null) {
        mCamera.release();
        mCamera = null;
        }
        }
        }
