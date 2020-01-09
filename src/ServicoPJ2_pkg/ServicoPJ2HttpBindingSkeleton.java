/**
 * ServicoPJ2HttpBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ServicoPJ2_pkg;

public class ServicoPJ2HttpBindingSkeleton implements ServicoPJ2_pkg.ServicoPJ2PortType, org.apache.axis.wsdl.Skeleton {
	private ServicoPJ2_pkg.ServicoPJ2PortType impl;
	private static java.util.Map _myOperations = new java.util.Hashtable();
	private static java.util.Collection _myOperationsList = new java.util.ArrayList();

	/**
	 * Returns List of OperationDesc objects with this name
	 */
	public static java.util.List getOperationDescByName(java.lang.String methodName) {
		return (java.util.List) _myOperations.get(methodName);
	}

	/**
	 * Returns Collection of OperationDescs
	 */
	public static java.util.Collection getOperationDescs() {
		return _myOperationsList;
	}

	static {
		org.apache.axis.description.OperationDesc _oper;
		org.apache.axis.description.FaultDesc _fault;
		org.apache.axis.description.ParameterDesc[] _params;
		_params = new org.apache.axis.description.ParameterDesc[] {
				new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("ServicoPJ2", "in0"),
						org.apache.axis.description.ParameterDesc.IN,
						new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"),
						java.lang.String.class, false, false),
				new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("ServicoPJ2", "in1"),
						org.apache.axis.description.ParameterDesc.IN,
						new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"),
						java.lang.String.class, false, false), };
		_oper = new org.apache.axis.description.OperationDesc("ajuizar", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "ajuizar"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("ajuizar") == null) {
			_myOperations.put("ajuizar", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("ajuizar")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] { new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("ServicoPJ2", "in0"), org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
				false, false), };
		_oper = new org.apache.axis.description.OperationDesc("confirmaLogon", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "confirmaLogon"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("confirmaLogon") == null) {
			_myOperations.put("confirmaLogon", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("confirmaLogon")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] {};
		_oper = new org.apache.axis.description.OperationDesc("getClasseTpParte", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "getClasseTpParte"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("getClasseTpParte") == null) {
			_myOperations.put("getClasseTpParte", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("getClasseTpParte")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] {
				new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("ServicoPJ2", "in0"),
						org.apache.axis.description.ParameterDesc.IN,
						new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"),
						java.lang.String.class, false, false),
				new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("ServicoPJ2", "in1"),
						org.apache.axis.description.ParameterDesc.IN,
						new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"),
						java.lang.String.class, false, false), };
		_oper = new org.apache.axis.description.OperationDesc("peticionarIntermediariaDiversa", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "peticionarIntermediariaDiversa"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("peticionarIntermediariaDiversa") == null) {
			_myOperations.put("peticionarIntermediariaDiversa", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("peticionarIntermediariaDiversa")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] { new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("ServicoPJ2", "in0"), org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
				false, false), };
		_oper = new org.apache.axis.description.OperationDesc("solicitacaoDadosDistribuicao", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "SolicitacaoDadosDistribuicao"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("solicitacaoDadosDistribuicao") == null) {
			_myOperations.put("solicitacaoDadosDistribuicao", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("solicitacaoDadosDistribuicao")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] {
				new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("ServicoPJ2", "in0"),
						org.apache.axis.description.ParameterDesc.IN,
						new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"),
						java.lang.String.class, false, false),
				new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("ServicoPJ2", "in1"),
						org.apache.axis.description.ParameterDesc.IN,
						new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"),
						java.lang.String.class, false, false), };
		_oper = new org.apache.axis.description.OperationDesc("peticionarIntermediaria", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "peticionarIntermediaria"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("peticionarIntermediaria") == null) {
			_myOperations.put("peticionarIntermediaria", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("peticionarIntermediaria")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] { new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("ServicoPJ2", "in0"), org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), };
		_oper = new org.apache.axis.description.OperationDesc("getAreasCompetenciasClassesEAssuntos", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "getAreasCompetenciasClassesEAssuntos"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("getAreasCompetenciasClassesEAssuntos") == null) {
			_myOperations.put("getAreasCompetenciasClassesEAssuntos", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("getAreasCompetenciasClassesEAssuntos")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] { new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("ServicoPJ2", "in0"), org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false),
				new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("ServicoPJ2", "in1"),
						org.apache.axis.description.ParameterDesc.IN,
						new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false,
						false), };
		_oper = new org.apache.axis.description.OperationDesc("getAssuntos", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "getAssuntos"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("getAssuntos") == null) {
			_myOperations.put("getAssuntos", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("getAssuntos")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] {
				new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("ServicoPJ2", "in0"),
						org.apache.axis.description.ParameterDesc.IN,
						new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"),
						java.lang.String.class, false, false),
				new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("ServicoPJ2", "in1"),
						org.apache.axis.description.ParameterDesc.IN,
						new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"),
						java.lang.String.class, false, false), };
		_oper = new org.apache.axis.description.OperationDesc("solicitacaoIntimacaoAto", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "SolicitacaoIntimacaoAto"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("solicitacaoIntimacaoAto") == null) {
			_myOperations.put("solicitacaoIntimacaoAto", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("solicitacaoIntimacaoAto")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] { new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("ServicoPJ2", "in0"), org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
				false, false), };
		_oper = new org.apache.axis.description.OperationDesc("solicitacaoDocCienciaAto", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "solicitacaoDocCienciaAto"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("solicitacaoDocCienciaAto") == null) {
			_myOperations.put("solicitacaoDocCienciaAto", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("solicitacaoDocCienciaAto")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] { new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("ServicoPJ2", "in0"), org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
				false, false), };
		_oper = new org.apache.axis.description.OperationDesc("consultaProcessoSGCR", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "ConsultaProcessoSGCR"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("consultaProcessoSGCR") == null) {
			_myOperations.put("consultaProcessoSGCR", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("consultaProcessoSGCR")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] { new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("ServicoPJ2", "in0"), org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
				false, false), };
		_oper = new org.apache.axis.description.OperationDesc("confirmaLogon", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "ConfirmaLogon"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("confirmaLogon") == null) {
			_myOperations.put("confirmaLogon", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("confirmaLogon")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] { new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("ServicoPJ2", "in0"), org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
				false, false), };
		_oper = new org.apache.axis.description.OperationDesc("getDadosProcesso", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "getDadosProcesso"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("getDadosProcesso") == null) {
			_myOperations.put("getDadosProcesso", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("getDadosProcesso")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] { new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("ServicoPJ2", "in0"), org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
				false, false), };
		_oper = new org.apache.axis.description.OperationDesc("solicitaLogon", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "SolicitaLogon"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("solicitaLogon") == null) {
			_myOperations.put("solicitaLogon", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("solicitaLogon")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] {
				new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("ServicoPJ2", "in0"),
						org.apache.axis.description.ParameterDesc.IN,
						new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"),
						java.lang.String.class, false, false),
				new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("ServicoPJ2", "in1"),
						org.apache.axis.description.ParameterDesc.IN,
						new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"),
						java.lang.String.class, false, false), };
		_oper = new org.apache.axis.description.OperationDesc("solicitacaoCitacaoCiencia", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "SolicitacaoCitacaoCiencia"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("solicitacaoCitacaoCiencia") == null) {
			_myOperations.put("solicitacaoCitacaoCiencia", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("solicitacaoCitacaoCiencia")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] {
				new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("ServicoPJ2", "in0"),
						org.apache.axis.description.ParameterDesc.IN,
						new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"),
						java.lang.String.class, false, false),
				new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("ServicoPJ2", "in1"),
						org.apache.axis.description.ParameterDesc.IN,
						new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"),
						java.lang.String.class, false, false), };
		_oper = new org.apache.axis.description.OperationDesc("logon", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "logon"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("logon") == null) {
			_myOperations.put("logon", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("logon")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] {
				new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("ServicoPJ2", "in0"),
						org.apache.axis.description.ParameterDesc.IN,
						new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"),
						java.lang.String.class, false, false),
				new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("ServicoPJ2", "in1"),
						org.apache.axis.description.ParameterDesc.IN,
						new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"),
						java.lang.String.class, false, false), };
		_oper = new org.apache.axis.description.OperationDesc("solicitacaoIntimacaoCiencia", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "SolicitacaoIntimacaoCiencia"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("solicitacaoIntimacaoCiencia") == null) {
			_myOperations.put("solicitacaoIntimacaoCiencia", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("solicitacaoIntimacaoCiencia")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] { new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("ServicoPJ2", "in0"), org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
				false, false), };
		_oper = new org.apache.axis.description.OperationDesc("consultaProcessoSG", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "ConsultaProcessoSG"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("consultaProcessoSG") == null) {
			_myOperations.put("consultaProcessoSG", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("consultaProcessoSG")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] { new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("ServicoPJ2", "in0"), org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), };
		_oper = new org.apache.axis.description.OperationDesc("getAreasCompetenciasEClasses", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "getAreasCompetenciasEClasses"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("getAreasCompetenciasEClasses") == null) {
			_myOperations.put("getAreasCompetenciasEClasses", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("getAreasCompetenciasEClasses")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] { new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("ServicoPJ2", "in0"), org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
				false, false), };
		_oper = new org.apache.axis.description.OperationDesc("solicitaLogon", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "solicitaLogon"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("solicitaLogon") == null) {
			_myOperations.put("solicitaLogon", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("solicitaLogon")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] {};
		_oper = new org.apache.axis.description.OperationDesc("getTiposDocDigital", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "getTiposDocDigital"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("getTiposDocDigital") == null) {
			_myOperations.put("getTiposDocDigital", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("getTiposDocDigital")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] {};
		_oper = new org.apache.axis.description.OperationDesc("getCategoriasEClasses", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "getCategoriasEClasses"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("getCategoriasEClasses") == null) {
			_myOperations.put("getCategoriasEClasses", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("getCategoriasEClasses")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] {};
		_oper = new org.apache.axis.description.OperationDesc("getTodosAssuntos", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "getTodosAssuntos"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("getTodosAssuntos") == null) {
			_myOperations.put("getTodosAssuntos", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("getTodosAssuntos")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] { new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("ServicoPJ2", "in0"), org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
				false, false), };
		_oper = new org.apache.axis.description.OperationDesc("solicitacaoIntimacaoAutoConfirmada", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "SolicitacaoIntimacaoAutoConfirmada"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("solicitacaoIntimacaoAutoConfirmada") == null) {
			_myOperations.put("solicitacaoIntimacaoAutoConfirmada", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("solicitacaoIntimacaoAutoConfirmada")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] {};
		_oper = new org.apache.axis.description.OperationDesc("getComarcas", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "getComarcas"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("getComarcas") == null) {
			_myOperations.put("getComarcas", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("getComarcas")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] { new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("ServicoPJ2", "in0"), org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
				false, false), };
		_oper = new org.apache.axis.description.OperationDesc("solicitaListaIntimacoesAguardandoCiencia", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "SolicitaListaIntimacoesAguardandoCiencia"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("solicitaListaIntimacoesAguardandoCiencia") == null) {
			_myOperations.put("solicitaListaIntimacoesAguardandoCiencia", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("solicitaListaIntimacoesAguardandoCiencia")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] { new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("ServicoPJ2", "in0"), org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
				false, false), };
		_oper = new org.apache.axis.description.OperationDesc("solicitaListaCitacoesAguardandoCiencia", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "SolicitaListaCitacoesAguardandoCiencia"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("solicitaListaCitacoesAguardandoCiencia") == null) {
			_myOperations.put("solicitaListaCitacoesAguardandoCiencia", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("solicitaListaCitacoesAguardandoCiencia")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] {};
		_oper = new org.apache.axis.description.OperationDesc("getForosEVaras", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "getForosEVaras"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("getForosEVaras") == null) {
			_myOperations.put("getForosEVaras", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("getForosEVaras")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] {};
		_oper = new org.apache.axis.description.OperationDesc("getTiposDiversas", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "getTiposDiversas"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("getTiposDiversas") == null) {
			_myOperations.put("getTiposDiversas", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("getTiposDiversas")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] {
				new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("ServicoPJ2", "in0"),
						org.apache.axis.description.ParameterDesc.IN,
						new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"),
						java.lang.String.class, false, false),
				new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("ServicoPJ2", "in1"),
						org.apache.axis.description.ParameterDesc.IN,
						new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"),
						java.lang.String.class, false, false), };
		_oper = new org.apache.axis.description.OperationDesc("solicitacaoCitacaoAto", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "SolicitacaoCitacaoAto"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("solicitacaoCitacaoAto") == null) {
			_myOperations.put("solicitacaoCitacaoAto", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("solicitacaoCitacaoAto")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] { new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("ServicoPJ2", "in0"), org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
				false, false), };
		_oper = new org.apache.axis.description.OperationDesc("solicitacaoCitacaoAutoConfirmada", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "SolicitacaoCitacaoAutoConfirmada"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("solicitacaoCitacaoAutoConfirmada") == null) {
			_myOperations.put("solicitacaoCitacaoAutoConfirmada", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("solicitacaoCitacaoAutoConfirmada")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] { new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("ServicoPJ2", "in0"), org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
				false, false), };
		_oper = new org.apache.axis.description.OperationDesc("obterNumeroUnificadoDoProcesso", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "obterNumeroUnificadoDoProcesso"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("obterNumeroUnificadoDoProcesso") == null) {
			_myOperations.put("obterNumeroUnificadoDoProcesso", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("obterNumeroUnificadoDoProcesso")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] { new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("ServicoPJ2", "in0"), org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
				false, false), };
		_oper = new org.apache.axis.description.OperationDesc("obterNumeroSajDoProcesso", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "obterNumeroSajDoProcesso"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("obterNumeroSajDoProcesso") == null) {
			_myOperations.put("obterNumeroSajDoProcesso", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("obterNumeroSajDoProcesso")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] { new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("ServicoPJ2", "in0"), org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
				false, false), };
		_oper = new org.apache.axis.description.OperationDesc("solicitacaoQtdIntimacoes", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "SolicitacaoQtdIntimacoes"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("solicitacaoQtdIntimacoes") == null) {
			_myOperations.put("solicitacaoQtdIntimacoes", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("solicitacaoQtdIntimacoes")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] { new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("ServicoPJ2", "in0"), org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
				false, false), };
		_oper = new org.apache.axis.description.OperationDesc("obterDocumentoAnexoAoAto", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "obterDocumentoAnexoAoAto"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("obterDocumentoAnexoAoAto") == null) {
			_myOperations.put("obterDocumentoAnexoAoAto", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("obterDocumentoAnexoAoAto")).add(_oper);
		_params = new org.apache.axis.description.ParameterDesc[] { new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("ServicoPJ2", "in0"), org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class,
				false, false), };
		_oper = new org.apache.axis.description.OperationDesc("consultaPeticao", _params,
				new javax.xml.namespace.QName("ServicoPJ2", "out"));
		_oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		_oper.setElementQName(new javax.xml.namespace.QName("ServicoPJ2", "ConsultaPeticao"));
		_oper.setSoapAction("");
		_myOperationsList.add(_oper);
		if (_myOperations.get("consultaPeticao") == null) {
			_myOperations.put("consultaPeticao", new java.util.ArrayList());
		}
		((java.util.List) _myOperations.get("consultaPeticao")).add(_oper);
	}

	public ServicoPJ2HttpBindingSkeleton() {
		this.impl = new ServicoPJ2_pkg.ServicoPJ2HttpBindingImpl();
	}

	public ServicoPJ2HttpBindingSkeleton(ServicoPJ2_pkg.ServicoPJ2PortType impl) {
		this.impl = impl;
	}

	public java.lang.String ajuizar(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException {
		java.lang.String ret = impl.ajuizar(in0, in1);
		return ret;
	}

	public java.lang.String confirmaLogon(java.lang.String in0) throws java.rmi.RemoteException {
		java.lang.String ret = impl.confirmaLogon(in0);
		return ret;
	}

	public java.lang.String getClasseTpParte() throws java.rmi.RemoteException {
		java.lang.String ret = impl.getClasseTpParte();
		return ret;
	}

	public java.lang.String peticionarIntermediariaDiversa(java.lang.String in0, java.lang.String in1)
			throws java.rmi.RemoteException {
		java.lang.String ret = impl.peticionarIntermediariaDiversa(in0, in1);
		return ret;
	}

	public java.lang.String solicitacaoDadosDistribuicao(java.lang.String in0) throws java.rmi.RemoteException {
		java.lang.String ret = impl.solicitacaoDadosDistribuicao(in0);
		return ret;
	}

	public java.lang.String peticionarIntermediaria(java.lang.String in0, java.lang.String in1)
			throws java.rmi.RemoteException {
		java.lang.String ret = impl.peticionarIntermediaria(in0, in1);
		return ret;
	}

	public java.lang.String getAreasCompetenciasClassesEAssuntos(int in0) throws java.rmi.RemoteException {
		java.lang.String ret = impl.getAreasCompetenciasClassesEAssuntos(in0);
		return ret;
	}

	public java.lang.String getAssuntos(int in0, int in1) throws java.rmi.RemoteException {
		java.lang.String ret = impl.getAssuntos(in0, in1);
		return ret;
	}

	public java.lang.String solicitacaoIntimacaoAto(java.lang.String in0, java.lang.String in1)
			throws java.rmi.RemoteException {
		java.lang.String ret = impl.solicitacaoIntimacaoAto(in0, in1);
		return ret;
	}

	public java.lang.String solicitacaoDocCienciaAto(java.lang.String in0) throws java.rmi.RemoteException {
		java.lang.String ret = impl.solicitacaoDocCienciaAto(in0);
		return ret;
	}

	public java.lang.String consultaProcessoSGCR(java.lang.String in0) throws java.rmi.RemoteException {
		java.lang.String ret = impl.consultaProcessoSGCR(in0);
		return ret;
	}

	/*
	public java.lang.String confirmaLogon(java.lang.String in0) throws java.rmi.RemoteException
	{
	    java.lang.String ret = impl.confirmaLogon(in0);
	    return ret;
	}
	*/
	public java.lang.String getDadosProcesso(java.lang.String in0) throws java.rmi.RemoteException {
		java.lang.String ret = impl.getDadosProcesso(in0);
		return ret;
	}

	public java.lang.String solicitaLogon(java.lang.String in0) throws java.rmi.RemoteException {
		java.lang.String ret = impl.solicitaLogon(in0);
		return ret;
	}

	public java.lang.String solicitacaoCitacaoCiencia(java.lang.String in0, java.lang.String in1)
			throws java.rmi.RemoteException {
		java.lang.String ret = impl.solicitacaoCitacaoCiencia(in0, in1);
		return ret;
	}

	public boolean logon(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException {
		boolean ret = impl.logon(in0, in1);
		return ret;
	}

	public java.lang.String solicitacaoIntimacaoCiencia(java.lang.String in0, java.lang.String in1)
			throws java.rmi.RemoteException {
		java.lang.String ret = impl.solicitacaoIntimacaoCiencia(in0, in1);
		return ret;
	}

	public java.lang.String consultaProcessoSG(java.lang.String in0) throws java.rmi.RemoteException {
		java.lang.String ret = impl.consultaProcessoSG(in0);
		return ret;
	}

	public java.lang.String getAreasCompetenciasEClasses(int in0) throws java.rmi.RemoteException {
		java.lang.String ret = impl.getAreasCompetenciasEClasses(in0);
		return ret;
	}

	/*
	public java.lang.String solicitaLogon(java.lang.String in0) throws java.rmi.RemoteException
	{
	    java.lang.String ret = impl.solicitaLogon(in0);
	    return ret;
	}
	*/
	public java.lang.String getTiposDocDigital() throws java.rmi.RemoteException {
		java.lang.String ret = impl.getTiposDocDigital();
		return ret;
	}

	public java.lang.String getCategoriasEClasses() throws java.rmi.RemoteException {
		java.lang.String ret = impl.getCategoriasEClasses();
		return ret;
	}

	public java.lang.String getTodosAssuntos() throws java.rmi.RemoteException {
		java.lang.String ret = impl.getTodosAssuntos();
		return ret;
	}

	public java.lang.String solicitacaoIntimacaoAutoConfirmada(java.lang.String in0) throws java.rmi.RemoteException {
		java.lang.String ret = impl.solicitacaoIntimacaoAutoConfirmada(in0);
		return ret;
	}

	public java.lang.String getComarcas() throws java.rmi.RemoteException {
		java.lang.String ret = impl.getComarcas();
		return ret;
	}

	public java.lang.String solicitaListaIntimacoesAguardandoCiencia(java.lang.String in0)
			throws java.rmi.RemoteException {
		java.lang.String ret = impl.solicitaListaIntimacoesAguardandoCiencia(in0);
		return ret;
	}

	public java.lang.String solicitaListaCitacoesAguardandoCiencia(java.lang.String in0)
			throws java.rmi.RemoteException {
		java.lang.String ret = impl.solicitaListaCitacoesAguardandoCiencia(in0);
		return ret;
	}

	public java.lang.String getForosEVaras() throws java.rmi.RemoteException {
		java.lang.String ret = impl.getForosEVaras();
		return ret;
	}

	public java.lang.String getTiposDiversas() throws java.rmi.RemoteException {
		java.lang.String ret = impl.getTiposDiversas();
		return ret;
	}

	public java.lang.String solicitacaoCitacaoAto(java.lang.String in0, java.lang.String in1)
			throws java.rmi.RemoteException {
		java.lang.String ret = impl.solicitacaoCitacaoAto(in0, in1);
		return ret;
	}

	public java.lang.String solicitacaoCitacaoAutoConfirmada(java.lang.String in0) throws java.rmi.RemoteException {
		java.lang.String ret = impl.solicitacaoCitacaoAutoConfirmada(in0);
		return ret;
	}

	public java.lang.String obterNumeroUnificadoDoProcesso(java.lang.String in0) throws java.rmi.RemoteException {
		java.lang.String ret = impl.obterNumeroUnificadoDoProcesso(in0);
		return ret;
	}

	public java.lang.String obterNumeroSajDoProcesso(java.lang.String in0) throws java.rmi.RemoteException {
		java.lang.String ret = impl.obterNumeroSajDoProcesso(in0);
		return ret;
	}

	public java.lang.String solicitacaoQtdIntimacoes(java.lang.String in0) throws java.rmi.RemoteException {
		java.lang.String ret = impl.solicitacaoQtdIntimacoes(in0);
		return ret;
	}

	public java.lang.String obterDocumentoAnexoAoAto(java.lang.String in0) throws java.rmi.RemoteException {
		java.lang.String ret = impl.obterDocumentoAnexoAoAto(in0);
		return ret;
	}

	public java.lang.String consultaPeticao(java.lang.String in0) throws java.rmi.RemoteException {
		java.lang.String ret = impl.consultaPeticao(in0);
		return ret;
	}

}
