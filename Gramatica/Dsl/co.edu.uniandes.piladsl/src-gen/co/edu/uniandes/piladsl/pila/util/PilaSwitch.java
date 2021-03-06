/**
 * generated by Xtext 2.10.0
 */
package co.edu.uniandes.piladsl.pila.util;

import co.edu.uniandes.piladsl.pila.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.piladsl.pila.PilaPackage
 * @generated
 */
public class PilaSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PilaPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PilaSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PilaPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PilaPackage.PAGO_SERVICIO:
      {
        PagoServicio pagoServicio = (PagoServicio)theEObject;
        T result = casePagoServicio(pagoServicio);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PilaPackage.ENTIDAD:
      {
        Entidad entidad = (Entidad)theEObject;
        T result = caseEntidad(entidad);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PilaPackage.ATRIBUTO:
      {
        Atributo atributo = (Atributo)theEObject;
        T result = caseAtributo(atributo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PilaPackage.LLAVE_VALOR:
      {
        LlaveValor llaveValor = (LlaveValor)theEObject;
        T result = caseLlaveValor(llaveValor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PilaPackage.SERVICIO_COMPUTO:
      {
        ServicioComputo servicioComputo = (ServicioComputo)theEObject;
        T result = caseServicioComputo(servicioComputo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PilaPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PilaPackage.CONDICION:
      {
        Condicion condicion = (Condicion)theEObject;
        T result = caseCondicion(condicion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PilaPackage.EXPRESION:
      {
        Expresion expresion = (Expresion)theEObject;
        T result = caseExpresion(expresion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PilaPackage.NOMBRE_CALIFICADO:
      {
        NombreCalificado nombreCalificado = (NombreCalificado)theEObject;
        T result = caseNombreCalificado(nombreCalificado);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pago Servicio</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pago Servicio</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePagoServicio(PagoServicio object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entidad</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entidad</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntidad(Entidad object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atributo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atributo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtributo(Atributo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Llave Valor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Llave Valor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLlaveValor(LlaveValor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Servicio Computo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Servicio Computo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServicioComputo(ServicioComputo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condicion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condicion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondicion(Condicion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expresion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expresion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpresion(Expresion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nombre Calificado</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nombre Calificado</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNombreCalificado(NombreCalificado object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PilaSwitch
