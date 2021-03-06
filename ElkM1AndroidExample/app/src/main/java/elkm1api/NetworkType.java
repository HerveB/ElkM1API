/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package elkm1api;

public final class NetworkType {
  public final static NetworkType NETWORKTYPE_NONE = new NetworkType("NETWORKTYPE_NONE", ElkM1APIJNI.NETWORKTYPE_NONE_get());
  public final static NetworkType NETWORKTYPE_ETHERNET = new NetworkType("NETWORKTYPE_ETHERNET", ElkM1APIJNI.NETWORKTYPE_ETHERNET_get());
  public final static NetworkType NETWORKTYPE_CELLULAR = new NetworkType("NETWORKTYPE_CELLULAR", ElkM1APIJNI.NETWORKTYPE_CELLULAR_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static NetworkType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + NetworkType.class + " with value " + swigValue);
  }

  private NetworkType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private NetworkType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private NetworkType(String swigName, NetworkType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static NetworkType[] swigValues = { NETWORKTYPE_NONE, NETWORKTYPE_ETHERNET, NETWORKTYPE_CELLULAR };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

