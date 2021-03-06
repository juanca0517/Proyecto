/**
 * generated by Xtext 2.10.0
 */
package co.edu.uniandes.piladsl.pila;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.piladsl.pila.PilaPackage
 * @generated
 */
public interface PilaFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PilaFactory eINSTANCE = co.edu.uniandes.piladsl.pila.impl.PilaFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Pago Servicio</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pago Servicio</em>'.
   * @generated
   */
  PagoServicio createPagoServicio();

  /**
   * Returns a new object of class '<em>Entidad</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entidad</em>'.
   * @generated
   */
  Entidad createEntidad();

  /**
   * Returns a new object of class '<em>Atributo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atributo</em>'.
   * @generated
   */
  Atributo createAtributo();

  /**
   * Returns a new object of class '<em>Llave Valor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Llave Valor</em>'.
   * @generated
   */
  LlaveValor createLlaveValor();

  /**
   * Returns a new object of class '<em>Servicio Computo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Servicio Computo</em>'.
   * @generated
   */
  ServicioComputo createServicioComputo();

  /**
   * Returns a new object of class '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable</em>'.
   * @generated
   */
  Variable createVariable();

  /**
   * Returns a new object of class '<em>Condicion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condicion</em>'.
   * @generated
   */
  Condicion createCondicion();

  /**
   * Returns a new object of class '<em>Expresion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expresion</em>'.
   * @generated
   */
  Expresion createExpresion();

  /**
   * Returns a new object of class '<em>Nombre Calificado</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nombre Calificado</em>'.
   * @generated
   */
  NombreCalificado createNombreCalificado();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PilaPackage getPilaPackage();

} //PilaFactory
