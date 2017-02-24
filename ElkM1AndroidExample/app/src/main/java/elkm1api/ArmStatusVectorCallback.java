/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package elkm1api;

public class ArmStatusVectorCallback {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected ArmStatusVectorCallback(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ArmStatusVectorCallback obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ElkM1APIJNI.delete_ArmStatusVectorCallback(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    ElkM1APIJNI.ArmStatusVectorCallback_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    ElkM1APIJNI.ArmStatusVectorCallback_change_ownership(this, swigCPtr, true);
  }

  public void run(ArmStatusVector status) {
    ElkM1APIJNI.ArmStatusVectorCallback_run(swigCPtr, this, ArmStatusVector.getCPtr(status), status);
  }

  public ArmStatusVectorCallback() {
    this(ElkM1APIJNI.new_ArmStatusVectorCallback(), true);
    ElkM1APIJNI.ArmStatusVectorCallback_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}