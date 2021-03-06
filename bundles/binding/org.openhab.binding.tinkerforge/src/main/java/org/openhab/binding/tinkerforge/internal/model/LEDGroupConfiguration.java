/**
 */
package org.openhab.binding.tinkerforge.internal.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LED Group Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhab.binding.tinkerforge.internal.model.LEDGroupConfiguration#getLeds <em>Leds</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getLEDGroupConfiguration()
 * @model
 * @generated
 */
public interface LEDGroupConfiguration extends TFConfig
{

  /**
   * Returns the value of the '<em><b>Leds</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Leds</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Leds</em>' attribute.
   * @see #setLeds(String)
   * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getLEDGroupConfiguration_Leds()
   * @model unique="false"
   * @generated
   */
  String getLeds();

  /**
   * Sets the value of the '{@link org.openhab.binding.tinkerforge.internal.model.LEDGroupConfiguration#getLeds <em>Leds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Leds</em>' attribute.
   * @see #getLeds()
   * @generated
   */
  void setLeds(String value);
} // LEDGroupConfiguration
