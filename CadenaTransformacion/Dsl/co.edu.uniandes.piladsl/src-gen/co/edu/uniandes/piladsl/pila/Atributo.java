/**
 * generated by Xtext 2.10.0
 */
package co.edu.uniandes.piladsl.pila;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.piladsl.pila.Atributo#getName <em>Name</em>}</li>
 *   <li>{@link co.edu.uniandes.piladsl.pila.Atributo#getTipoPrimitivo <em>Tipo Primitivo</em>}</li>
 *   <li>{@link co.edu.uniandes.piladsl.pila.Atributo#getListaLlaveValor <em>Lista Llave Valor</em>}</li>
 *   <li>{@link co.edu.uniandes.piladsl.pila.Atributo#getListaEntidad <em>Lista Entidad</em>}</li>
 *   <li>{@link co.edu.uniandes.piladsl.pila.Atributo#getReferencia <em>Referencia</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.piladsl.pila.PilaPackage#getAtributo()
 * @model
 * @generated
 */
public interface Atributo extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see co.edu.uniandes.piladsl.pila.PilaPackage#getAtributo_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link co.edu.uniandes.piladsl.pila.Atributo#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Tipo Primitivo</b></em>' attribute.
   * The literals are from the enumeration {@link co.edu.uniandes.piladsl.pila.TipoDatoPrimitivo}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tipo Primitivo</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo Primitivo</em>' attribute.
   * @see co.edu.uniandes.piladsl.pila.TipoDatoPrimitivo
   * @see #setTipoPrimitivo(TipoDatoPrimitivo)
   * @see co.edu.uniandes.piladsl.pila.PilaPackage#getAtributo_TipoPrimitivo()
   * @model
   * @generated
   */
  TipoDatoPrimitivo getTipoPrimitivo();

  /**
   * Sets the value of the '{@link co.edu.uniandes.piladsl.pila.Atributo#getTipoPrimitivo <em>Tipo Primitivo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo Primitivo</em>' attribute.
   * @see co.edu.uniandes.piladsl.pila.TipoDatoPrimitivo
   * @see #getTipoPrimitivo()
   * @generated
   */
  void setTipoPrimitivo(TipoDatoPrimitivo value);

  /**
   * Returns the value of the '<em><b>Lista Llave Valor</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.piladsl.pila.LlaveValor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lista Llave Valor</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lista Llave Valor</em>' containment reference list.
   * @see co.edu.uniandes.piladsl.pila.PilaPackage#getAtributo_ListaLlaveValor()
   * @model containment="true"
   * @generated
   */
  EList<LlaveValor> getListaLlaveValor();

  /**
   * Returns the value of the '<em><b>Lista Entidad</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lista Entidad</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lista Entidad</em>' reference.
   * @see #setListaEntidad(Entidad)
   * @see co.edu.uniandes.piladsl.pila.PilaPackage#getAtributo_ListaEntidad()
   * @model
   * @generated
   */
  Entidad getListaEntidad();

  /**
   * Sets the value of the '{@link co.edu.uniandes.piladsl.pila.Atributo#getListaEntidad <em>Lista Entidad</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lista Entidad</em>' reference.
   * @see #getListaEntidad()
   * @generated
   */
  void setListaEntidad(Entidad value);

  /**
   * Returns the value of the '<em><b>Referencia</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referencia</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referencia</em>' attribute.
   * @see #setReferencia(String)
   * @see co.edu.uniandes.piladsl.pila.PilaPackage#getAtributo_Referencia()
   * @model
   * @generated
   */
  String getReferencia();

  /**
   * Sets the value of the '{@link co.edu.uniandes.piladsl.pila.Atributo#getReferencia <em>Referencia</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Referencia</em>' attribute.
   * @see #getReferencia()
   * @generated
   */
  void setReferencia(String value);

} // Atributo
