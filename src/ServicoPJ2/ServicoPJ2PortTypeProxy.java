package ServicoPJ2;

import java.rmi.RemoteException;

import ServicoPJ2_pkg.ServicoPJ2Locator;
import ServicoPJ2_pkg.ServicoPJ2PortType;

public class ServicoPJ2PortTypeProxy implements ServicoPJ2PortType {
  private String _endpoint = null;
  private ServicoPJ2PortType servicoPJ2PortType = null;
  
  public ServicoPJ2PortTypeProxy() {
    _initServicoPJ2PortTypeProxy();
  }
  
  public ServicoPJ2PortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initServicoPJ2PortTypeProxy();
  }
  
  private void _initServicoPJ2PortTypeProxy() {
    try {
      servicoPJ2PortType = (new ServicoPJ2Locator()).getServicoPJ2HttpPort();
      if (servicoPJ2PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)servicoPJ2PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)servicoPJ2PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (servicoPJ2PortType != null)
      ((javax.xml.rpc.Stub)servicoPJ2PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ServicoPJ2PortType getServicoPJ2PortType() {
    if (servicoPJ2PortType == null)
      _initServicoPJ2PortTypeProxy();
    return servicoPJ2PortType;
  }

@Override
public String ajuizar(String in0, String in1) throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String confirmaLogon(String in0) throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getClasseTpParte() throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String peticionarIntermediariaDiversa(String in0, String in1) throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String solicitacaoDadosDistribuicao(String in0) throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String peticionarIntermediaria(String in0, String in1) throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getAreasCompetenciasClassesEAssuntos(int in0) throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getAssuntos(int in0, int in1) throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String solicitacaoIntimacaoAto(String in0, String in1) throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String solicitacaoDocCienciaAto(String in0) throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String consultaProcessoSGCR(String in0) throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getDadosProcesso(String in0) throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String solicitaLogon(String in0) throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String solicitacaoCitacaoCiencia(String in0, String in1) throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean logon(String in0, String in1) throws RemoteException {
	// TODO Auto-generated method stub
	return false;
}

@Override
public String solicitacaoIntimacaoCiencia(String in0, String in1) throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String consultaProcessoSG(String in0) throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getAreasCompetenciasEClasses(int in0) throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getTiposDocDigital() throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getCategoriasEClasses() throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getTodosAssuntos() throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String solicitacaoIntimacaoAutoConfirmada(String in0) throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getComarcas() throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String solicitaListaIntimacoesAguardandoCiencia(String in0) throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String solicitaListaCitacoesAguardandoCiencia(String in0) throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getForosEVaras() throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getTiposDiversas() throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String solicitacaoCitacaoAto(String in0, String in1) throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String solicitacaoCitacaoAutoConfirmada(String in0) throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String obterNumeroUnificadoDoProcesso(String in0) throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String obterNumeroSajDoProcesso(String in0) throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String solicitacaoQtdIntimacoes(String in0) throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String obterDocumentoAnexoAoAto(String in0) throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String consultaPeticao(String in0) throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}
  
  
}