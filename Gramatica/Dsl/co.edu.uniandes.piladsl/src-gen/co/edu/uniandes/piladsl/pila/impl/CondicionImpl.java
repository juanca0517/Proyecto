/**
 * generated by Xtext 2.10.0
 */
package co.edu.uniandes.piladsl.pila.impl;

import co.edu.uniandes.piladsl.pila.Condicion;
import co.edu.uniandes.piladsl.pila.Expresion;
import co.edu.uniandes.piladsl.pila.PilaPackage;
import co.edu.uniandes.piladsl.pila.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condicion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.piladsl.pila.impl.CondicionImpl#getCondicionSi <em>Condicion Si</em>}</li>
 *   <li>{@link co.edu.uniandes.piladsl.pila.impl.CondicionImpl#getExpresionCondicion <em>Expresion Condicion</em>}</li>
 *   <li>{@link co.edu.uniandes.piladsl.pila.impl.CondicionImpl#getCondicionSiNinguno <em>Condicion Si Ninguno</em>}</li>
 *   <li>{@link co.edu.uniandes.piladsl.pila.impl.CondicionImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link co.edu.uniandes.piladsl.pila.impl.CondicionImpl#getAsignacionVariable <em>Asignacion Variable</em>}</li>
 *   <li>{@link co.edu.uniandes.piladsl.pila.impl.CondicionImpl#getExpresion <em>Expresion</em>}</li>
 *   <li>{@link co.edu.uniandes.piladsl.pila.impl.CondicionImpl#getSubCondiciones <em>Sub Condiciones</em>}</li>
 *   <li>{@link co.edu.uniandes.piladsl.pila.impl.CondicionImpl#getExpresionRetorno <em>Expresion Retorno</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CondicionImpl extends MinimalEObjectImpl.Container implements Condicion
{
  /**
   * The default value of the '{@link #getCondicionSi() <em>Condicion Si</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondicionSi()
   * @generated
   * @ordered
   */
  protected static final String CONDICION_SI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCondicionSi() <em>Condicion Si</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondicionSi()
   * @generated
   * @ordered
   */
  protected String condicionSi = CONDICION_SI_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpresionCondicion() <em>Expresion Condicion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpresionCondicion()
   * @generated
   * @ordered
   */
  protected Expresion expresionCondicion;

  /**
   * The default value of the '{@link #getCondicionSiNinguno() <em>Condicion Si Ninguno</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondicionSiNinguno()
   * @generated
   * @ordered
   */
  protected static final String CONDICION_SI_NINGUNO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCondicionSiNinguno() <em>Condicion Si Ninguno</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondicionSiNinguno()
   * @generated
   * @ordered
   */
  protected String condicionSiNinguno = CONDICION_SI_NINGUNO_EDEFAULT;

  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<Variable> variables;

  /**
   * The cached value of the '{@link #getAsignacionVariable() <em>Asignacion Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAsignacionVariable()
   * @generated
   * @ordered
   */
  protected Variable asignacionVariable;

  /**
   * The cached value of the '{@link #getExpresion() <em>Expresion</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpresion()
   * @generated
   * @ordered
   */
  protected EList<Expresion> expresion;

  /**
   * The cached value of the '{@link #getSubCondiciones() <em>Sub Condiciones</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubCondiciones()
   * @generated
   * @ordered
   */
  protected EList<Condicion> subCondiciones;

  /**
   * The cached value of the '{@link #getExpresionRetorno() <em>Expresion Retorno</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpresionRetorno()
   * @generated
   * @ordered
   */
  protected Expresion expresionRetorno;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CondicionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PilaPackage.Literals.CONDICION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCondicionSi()
  {
    return condicionSi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondicionSi(String newCondicionSi)
  {
    String oldCondicionSi = condicionSi;
    condicionSi = newCondicionSi;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PilaPackage.CONDICION__CONDICION_SI, oldCondicionSi, condicionSi));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expresion getExpresionCondicion()
  {
    return expresionCondicion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpresionCondicion(Expresion newExpresionCondicion, NotificationChain msgs)
  {
    Expresion oldExpresionCondicion = expresionCondicion;
    expresionCondicion = newExpresionCondicion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PilaPackage.CONDICION__EXPRESION_CONDICION, oldExpresionCondicion, newExpresionCondicion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpresionCondicion(Expresion newExpresionCondicion)
  {
    if (newExpresionCondicion != expresionCondicion)
    {
      NotificationChain msgs = null;
      if (expresionCondicion != null)
        msgs = ((InternalEObject)expresionCondicion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PilaPackage.CONDICION__EXPRESION_CONDICION, null, msgs);
      if (newExpresionCondicion != null)
        msgs = ((InternalEObject)newExpresionCondicion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PilaPackage.CONDICION__EXPRESION_CONDICION, null, msgs);
      msgs = basicSetExpresionCondicion(newExpresionCondicion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PilaPackage.CONDICION__EXPRESION_CONDICION, newExpresionCondicion, newExpresionCondicion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCondicionSiNinguno()
  {
    return condicionSiNinguno;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondicionSiNinguno(String newCondicionSiNinguno)
  {
    String oldCondicionSiNinguno = condicionSiNinguno;
    condicionSiNinguno = newCondicionSiNinguno;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PilaPackage.CONDICION__CONDICION_SI_NINGUNO, oldCondicionSiNinguno, condicionSiNinguno));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable> getVariables()
  {
    if (variables == null)
    {
      variables = new EObjectContainmentEList<Variable>(Variable.class, this, PilaPackage.CONDICION__VARIABLES);
    }
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getAsignacionVariable()
  {
    if (asignacionVariable != null && asignacionVariable.eIsProxy())
    {
      InternalEObject oldAsignacionVariable = (InternalEObject)asignacionVariable;
      asignacionVariable = (Variable)eResolveProxy(oldAsignacionVariable);
      if (asignacionVariable != oldAsignacionVariable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PilaPackage.CONDICION__ASIGNACION_VARIABLE, oldAsignacionVariable, asignacionVariable));
      }
    }
    return asignacionVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable basicGetAsignacionVariable()
  {
    return asignacionVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAsignacionVariable(Variable newAsignacionVariable)
  {
    Variable oldAsignacionVariable = asignacionVariable;
    asignacionVariable = newAsignacionVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PilaPackage.CONDICION__ASIGNACION_VARIABLE, oldAsignacionVariable, asignacionVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expresion> getExpresion()
  {
    if (expresion == null)
    {
      expresion = new EObjectContainmentEList<Expresion>(Expresion.class, this, PilaPackage.CONDICION__EXPRESION);
    }
    return expresion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Condicion> getSubCondiciones()
  {
    if (subCondiciones == null)
    {
      subCondiciones = new EObjectContainmentEList<Condicion>(Condicion.class, this, PilaPackage.CONDICION__SUB_CONDICIONES);
    }
    return subCondiciones;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expresion getExpresionRetorno()
  {
    return expresionRetorno;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpresionRetorno(Expresion newExpresionRetorno, NotificationChain msgs)
  {
    Expresion oldExpresionRetorno = expresionRetorno;
    expresionRetorno = newExpresionRetorno;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PilaPackage.CONDICION__EXPRESION_RETORNO, oldExpresionRetorno, newExpresionRetorno);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpresionRetorno(Expresion newExpresionRetorno)
  {
    if (newExpresionRetorno != expresionRetorno)
    {
      NotificationChain msgs = null;
      if (expresionRetorno != null)
        msgs = ((InternalEObject)expresionRetorno).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PilaPackage.CONDICION__EXPRESION_RETORNO, null, msgs);
      if (newExpresionRetorno != null)
        msgs = ((InternalEObject)newExpresionRetorno).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PilaPackage.CONDICION__EXPRESION_RETORNO, null, msgs);
      msgs = basicSetExpresionRetorno(newExpresionRetorno, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PilaPackage.CONDICION__EXPRESION_RETORNO, newExpresionRetorno, newExpresionRetorno));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PilaPackage.CONDICION__EXPRESION_CONDICION:
        return basicSetExpresionCondicion(null, msgs);
      case PilaPackage.CONDICION__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
      case PilaPackage.CONDICION__EXPRESION:
        return ((InternalEList<?>)getExpresion()).basicRemove(otherEnd, msgs);
      case PilaPackage.CONDICION__SUB_CONDICIONES:
        return ((InternalEList<?>)getSubCondiciones()).basicRemove(otherEnd, msgs);
      case PilaPackage.CONDICION__EXPRESION_RETORNO:
        return basicSetExpresionRetorno(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PilaPackage.CONDICION__CONDICION_SI:
        return getCondicionSi();
      case PilaPackage.CONDICION__EXPRESION_CONDICION:
        return getExpresionCondicion();
      case PilaPackage.CONDICION__CONDICION_SI_NINGUNO:
        return getCondicionSiNinguno();
      case PilaPackage.CONDICION__VARIABLES:
        return getVariables();
      case PilaPackage.CONDICION__ASIGNACION_VARIABLE:
        if (resolve) return getAsignacionVariable();
        return basicGetAsignacionVariable();
      case PilaPackage.CONDICION__EXPRESION:
        return getExpresion();
      case PilaPackage.CONDICION__SUB_CONDICIONES:
        return getSubCondiciones();
      case PilaPackage.CONDICION__EXPRESION_RETORNO:
        return getExpresionRetorno();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PilaPackage.CONDICION__CONDICION_SI:
        setCondicionSi((String)newValue);
        return;
      case PilaPackage.CONDICION__EXPRESION_CONDICION:
        setExpresionCondicion((Expresion)newValue);
        return;
      case PilaPackage.CONDICION__CONDICION_SI_NINGUNO:
        setCondicionSiNinguno((String)newValue);
        return;
      case PilaPackage.CONDICION__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends Variable>)newValue);
        return;
      case PilaPackage.CONDICION__ASIGNACION_VARIABLE:
        setAsignacionVariable((Variable)newValue);
        return;
      case PilaPackage.CONDICION__EXPRESION:
        getExpresion().clear();
        getExpresion().addAll((Collection<? extends Expresion>)newValue);
        return;
      case PilaPackage.CONDICION__SUB_CONDICIONES:
        getSubCondiciones().clear();
        getSubCondiciones().addAll((Collection<? extends Condicion>)newValue);
        return;
      case PilaPackage.CONDICION__EXPRESION_RETORNO:
        setExpresionRetorno((Expresion)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PilaPackage.CONDICION__CONDICION_SI:
        setCondicionSi(CONDICION_SI_EDEFAULT);
        return;
      case PilaPackage.CONDICION__EXPRESION_CONDICION:
        setExpresionCondicion((Expresion)null);
        return;
      case PilaPackage.CONDICION__CONDICION_SI_NINGUNO:
        setCondicionSiNinguno(CONDICION_SI_NINGUNO_EDEFAULT);
        return;
      case PilaPackage.CONDICION__VARIABLES:
        getVariables().clear();
        return;
      case PilaPackage.CONDICION__ASIGNACION_VARIABLE:
        setAsignacionVariable((Variable)null);
        return;
      case PilaPackage.CONDICION__EXPRESION:
        getExpresion().clear();
        return;
      case PilaPackage.CONDICION__SUB_CONDICIONES:
        getSubCondiciones().clear();
        return;
      case PilaPackage.CONDICION__EXPRESION_RETORNO:
        setExpresionRetorno((Expresion)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PilaPackage.CONDICION__CONDICION_SI:
        return CONDICION_SI_EDEFAULT == null ? condicionSi != null : !CONDICION_SI_EDEFAULT.equals(condicionSi);
      case PilaPackage.CONDICION__EXPRESION_CONDICION:
        return expresionCondicion != null;
      case PilaPackage.CONDICION__CONDICION_SI_NINGUNO:
        return CONDICION_SI_NINGUNO_EDEFAULT == null ? condicionSiNinguno != null : !CONDICION_SI_NINGUNO_EDEFAULT.equals(condicionSiNinguno);
      case PilaPackage.CONDICION__VARIABLES:
        return variables != null && !variables.isEmpty();
      case PilaPackage.CONDICION__ASIGNACION_VARIABLE:
        return asignacionVariable != null;
      case PilaPackage.CONDICION__EXPRESION:
        return expresion != null && !expresion.isEmpty();
      case PilaPackage.CONDICION__SUB_CONDICIONES:
        return subCondiciones != null && !subCondiciones.isEmpty();
      case PilaPackage.CONDICION__EXPRESION_RETORNO:
        return expresionRetorno != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (condicionSi: ");
    result.append(condicionSi);
    result.append(", condicionSiNinguno: ");
    result.append(condicionSiNinguno);
    result.append(')');
    return result.toString();
  }

} //CondicionImpl
