/**
 * generated by Xtext 2.10.0
 */
package co.edu.uniandes.piladsl.pila;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condicion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.piladsl.pila.Condicion#getCondicionSi <em>Condicion Si</em>}</li>
 *   <li>{@link co.edu.uniandes.piladsl.pila.Condicion#getExpresionCondicion <em>Expresion Condicion</em>}</li>
 *   <li>{@link co.edu.uniandes.piladsl.pila.Condicion#getCondicionSiNinguno <em>Condicion Si Ninguno</em>}</li>
 *   <li>{@link co.edu.uniandes.piladsl.pila.Condicion#getVariables <em>Variables</em>}</li>
 *   <li>{@link co.edu.uniandes.piladsl.pila.Condicion#getAsignacionVariable <em>Asignacion Variable</em>}</li>
 *   <li>{@link co.edu.uniandes.piladsl.pila.Condicion#getExpresion <em>Expresion</em>}</li>
 *   <li>{@link co.edu.uniandes.piladsl.pila.Condicion#getSubCondiciones <em>Sub Condiciones</em>}</li>
 *   <li>{@link co.edu.uniandes.piladsl.pila.Condicion#getExpresionRetorno <em>Expresion Retorno</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.piladsl.pila.PilaPackage#getCondicion()
 * @model
 * @generated
 */
public interface Condicion extends EObject
{
  /**
   * Returns the value of the '<em><b>Condicion Si</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condicion Si</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condicion Si</em>' attribute.
   * @see #setCondicionSi(String)
   * @see co.edu.uniandes.piladsl.pila.PilaPackage#getCondicion_CondicionSi()
   * @model
   * @generated
   */
  String getCondicionSi();

  /**
   * Sets the value of the '{@link co.edu.uniandes.piladsl.pila.Condicion#getCondicionSi <em>Condicion Si</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condicion Si</em>' attribute.
   * @see #getCondicionSi()
   * @generated
   */
  void setCondicionSi(String value);

  /**
   * Returns the value of the '<em><b>Expresion Condicion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expresion Condicion</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expresion Condicion</em>' containment reference.
   * @see #setExpresionCondicion(Expresion)
   * @see co.edu.uniandes.piladsl.pila.PilaPackage#getCondicion_ExpresionCondicion()
   * @model containment="true"
   * @generated
   */
  Expresion getExpresionCondicion();

  /**
   * Sets the value of the '{@link co.edu.uniandes.piladsl.pila.Condicion#getExpresionCondicion <em>Expresion Condicion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expresion Condicion</em>' containment reference.
   * @see #getExpresionCondicion()
   * @generated
   */
  void setExpresionCondicion(Expresion value);

  /**
   * Returns the value of the '<em><b>Condicion Si Ninguno</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condicion Si Ninguno</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condicion Si Ninguno</em>' attribute.
   * @see #setCondicionSiNinguno(String)
   * @see co.edu.uniandes.piladsl.pila.PilaPackage#getCondicion_CondicionSiNinguno()
   * @model
   * @generated
   */
  String getCondicionSiNinguno();

  /**
   * Sets the value of the '{@link co.edu.uniandes.piladsl.pila.Condicion#getCondicionSiNinguno <em>Condicion Si Ninguno</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condicion Si Ninguno</em>' attribute.
   * @see #getCondicionSiNinguno()
   * @generated
   */
  void setCondicionSiNinguno(String value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.piladsl.pila.Variable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see co.edu.uniandes.piladsl.pila.PilaPackage#getCondicion_Variables()
   * @model containment="true"
   * @generated
   */
  EList<Variable> getVariables();

  /**
   * Returns the value of the '<em><b>Asignacion Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Asignacion Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Asignacion Variable</em>' reference.
   * @see #setAsignacionVariable(Variable)
   * @see co.edu.uniandes.piladsl.pila.PilaPackage#getCondicion_AsignacionVariable()
   * @model
   * @generated
   */
  Variable getAsignacionVariable();

  /**
   * Sets the value of the '{@link co.edu.uniandes.piladsl.pila.Condicion#getAsignacionVariable <em>Asignacion Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Asignacion Variable</em>' reference.
   * @see #getAsignacionVariable()
   * @generated
   */
  void setAsignacionVariable(Variable value);

  /**
   * Returns the value of the '<em><b>Expresion</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.piladsl.pila.Expresion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expresion</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expresion</em>' containment reference list.
   * @see co.edu.uniandes.piladsl.pila.PilaPackage#getCondicion_Expresion()
   * @model containment="true"
   * @generated
   */
  EList<Expresion> getExpresion();

  /**
   * Returns the value of the '<em><b>Sub Condiciones</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.piladsl.pila.Condicion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Condiciones</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Condiciones</em>' containment reference list.
   * @see co.edu.uniandes.piladsl.pila.PilaPackage#getCondicion_SubCondiciones()
   * @model containment="true"
   * @generated
   */
  EList<Condicion> getSubCondiciones();

  /**
   * Returns the value of the '<em><b>Expresion Retorno</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expresion Retorno</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expresion Retorno</em>' containment reference.
   * @see #setExpresionRetorno(Expresion)
   * @see co.edu.uniandes.piladsl.pila.PilaPackage#getCondicion_ExpresionRetorno()
   * @model containment="true"
   * @generated
   */
  Expresion getExpresionRetorno();

  /**
   * Sets the value of the '{@link co.edu.uniandes.piladsl.pila.Condicion#getExpresionRetorno <em>Expresion Retorno</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expresion Retorno</em>' containment reference.
   * @see #getExpresionRetorno()
   * @generated
   */
  void setExpresionRetorno(Expresion value);

} // Condicion