package csv.editor.teste;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import csv.editor.persistencia.ConexaoBD;

public class Veiculo {
	private String municipio;
	private int id;
	private int ano;
	private int mes;
	private int automovel;
	private int bonde;
	private int caminhao;
	private int caminhaotrator;
	private int caminhonete;
	private int camioneta;
	private int chassisplataforma;
	private int ciclomotor;
	private int microonibus;
	private int motocicleta;
	private int estado;
	private int motoneta;
	private int onibus;
	private int quadriciclo;
	private int reboque;
	private int seimreboque;
	private int sidecar;
	private int outros;
	private int tratoresteira;
	private int tratorrodas;
	private int triciclo;
	private int utilitario;
	private static int idmunicipio=1;
	
	public Veiculo(String municipio, int id, int ano, int mes, int automovel, int bonde, int caminhao,
			int caminhaotrator, int caminhonete, int camioneta, int chassisplataforma, int ciclomotor, int microonibus,
			int motocicleta, int estado) {
		this.municipio = municipio;
		this.id = id;
		this.ano = ano;
		this.mes = mes;
		this.automovel = automovel;
		this.bonde = bonde;
		this.caminhao = caminhao;
		this.caminhaotrator = caminhaotrator;
		this.caminhonete = caminhonete;
		this.camioneta = camioneta;
		this.chassisplataforma = chassisplataforma;
		this.ciclomotor = ciclomotor;
		this.microonibus = microonibus;
		this.motocicleta = motocicleta;
		this.estado = estado;
	}
	public Veiculo(String municipio, int id, int ano, int mes, int automovel, int bonde, int caminhao,
			int caminhaotrator, int caminhonete, int camioneta, int chassisplataforma, int ciclomotor, int microonibus,
			int motocicleta) {
		this.municipio = municipio;
		this.id = id;
		this.ano = ano;
		this.mes = mes;
		this.automovel = automovel;
		this.bonde = bonde;
		this.caminhao = caminhao;
		this.caminhaotrator = caminhaotrator;
		this.caminhonete = caminhonete;
		this.camioneta = camioneta;
		this.chassisplataforma = chassisplataforma;
		this.ciclomotor = ciclomotor;
		this.microonibus = microonibus;
		this.motocicleta = motocicleta;
	}

	public Veiculo(String municipio, int id, int ano) {
		this.municipio = municipio;
		this.id = id;
		this.ano = ano;
	}
	
	public Veiculo(String municipio, int id, int ano, int estado) {
		this.municipio = municipio;
		this.id = id;
		this.ano = ano;
		this.estado=estado;
	}
	
	public Veiculo(String municipio, int id, int ano, int mes, int automovel, int bonde, int caminhao,
			int caminhaotrator, int caminhonete, int camioneta, int chassisplataforma, int ciclomotor, int microonibus,
			int motocicleta, int motoneta, int onibus, int quadriciclo, int reboque, int seimreboque,
			int sidecar, int outros, int tratoresteira, int tratorrodas, int triciclo, int utilitario, int estado) {
		super();
		this.municipio = municipio;
		this.id = id;
		this.ano = ano;
		this.mes = mes;
		this.automovel = automovel;
		this.bonde = bonde;
		this.caminhao = caminhao;
		this.caminhaotrator = caminhaotrator;
		this.caminhonete = caminhonete;
		this.camioneta = camioneta;
		this.chassisplataforma = chassisplataforma;
		this.ciclomotor = ciclomotor;
		this.microonibus = microonibus;
		this.motocicleta = motocicleta;
		this.estado = estado;
		this.motoneta = motoneta;
		this.onibus = onibus;
		this.quadriciclo = quadriciclo;
		this.reboque = reboque;
		this.seimreboque = seimreboque;
		this.sidecar = sidecar;
		this.outros = outros;
		this.tratoresteira = tratoresteira;
		this.tratorrodas = tratorrodas;
		this.triciclo = triciclo;
		this.utilitario = utilitario;
	}

	
	
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado1) {
		estado = estado1;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAutomovel() {
		return automovel;
	}

	public void setAutomovel(int automovel) {
		this.automovel = automovel;
	}

	public int getBonde() {
		return bonde;
	}

	public void setBonde(int bonde) {
		this.bonde = bonde;
	}

	public int getCaminhao() {
		return caminhao;
	}

	public void setCaminhao(int caminhao) {
		this.caminhao = caminhao;
	}

	public int getCaminhaotrator() {
		return caminhaotrator;
	}

	public void setCaminhaotrator(int caminhaotrator) {
		this.caminhaotrator = caminhaotrator;
	}

	public int getCaminhonete() {
		return caminhonete;
	}

	public void setCaminhonete(int caminhonete) {
		this.caminhonete = caminhonete;
	}

	public int getCamioneta() {
		return camioneta;
	}

	public void setCamioneta(int camioneta) {
		this.camioneta = camioneta;
	}

	public int getChassisplataforma() {
		return chassisplataforma;
	}

	public void setChassisplataforma(int chassisplataforma) {
		this.chassisplataforma = chassisplataforma;
	}

	public int getCiclomotor() {
		return ciclomotor;
	}

	public void setCiclomotor(int ciclomotor) {
		this.ciclomotor = ciclomotor;
	}

	public int getMicroonibus() {
		return microonibus;
	}

	public void setMicroonibus(int microonibus) {
		this.microonibus = microonibus;
	}

	public int getMotocicleta() {
		return motocicleta;
	}

	public void setMotocicleta(int motocicleta) {
		this.motocicleta = motocicleta;
	}

	public int getMotoneta() {
		return motoneta;
	}
	public void setMotoneta(int motoneta) {
		this.motoneta = motoneta;
	}
	public int getOnibus() {
		return onibus;
	}
	public void setOnibus(int onibus) {
		this.onibus = onibus;
	}
	public int getQuadriciclo() {
		return quadriciclo;
	}
	public void setQuadriciclo(int quadriciclo) {
		this.quadriciclo = quadriciclo;
	}
	public int getReboque() {
		return reboque;
	}
	public void setReboque(int reboque) {
		this.reboque = reboque;
	}
	public int getSeimreboque() {
		return seimreboque;
	}
	public void setSeimreboque(int seimreboque) {
		this.seimreboque = seimreboque;
	}
	public int getSidecar() {
		return sidecar;
	}
	public void setSidecar(int sidecar) {
		this.sidecar = sidecar;
	}
	public int getOutros() {
		return outros;
	}
	public void setOutros(int outros) {
		this.outros = outros;
	}
	public int getTratoresteira() {
		return tratoresteira;
	}
	public void setTratoresteira(int tratoresteira) {
		this.tratoresteira = tratoresteira;
	}
	public int getTratorrodas() {
		return tratorrodas;
	}
	public void setTratorrodas(int tratorrodas) {
		this.tratorrodas = tratorrodas;
	}
	public int getTriciclo() {
		return triciclo;
	}
	public void setTriciclo(int triciclo) {
		this.triciclo = triciclo;
	}
	public int getUtilitario() {
		return utilitario;
	}
	public void setUtilitario(int utilitario) {
		this.utilitario = utilitario;
	}

	
	
	@Override public String toString() {
		return "Veiculo [Municipio=" + municipio + ", id =" + id + ", ano =" + ano + ", mes ="+ mes + ", automovel ="+
		automovel + ", Bonde ="+ bonde + ", Caminhao ="+ caminhao +", CaminhaTrator ="+ caminhaotrator +
		", Caminhonete ="+ caminhonete +", Camioneta ="+ camioneta + ", ChassisPlataforma ="+ chassisplataforma +", Ciclomotor ="+ ciclomotor +
		", Microonibus ="+ microonibus +", Motocicleta ="+ motocicleta +", Estado ="+ estado +"]"+"\n"; 
		}

	public void salvarMunicipios() throws SQLException {
		Connection conexao = null;

		try {
			
			conexao = ConexaoBD.getConexao();

			PreparedStatement sql = conexao.prepareStatement("INSERT INTO municipios(mun_codigo_municipio,mun_est_id) VALUES(?, ?)");
			sql.setString(1,String.valueOf(id));
			sql.setLong(2,estado);
			sql.execute();
		} finally {
			conexao.close();
		}
	}
	
	public void salvarOcorrencias() throws SQLException {
		Connection conexao = null;
		
		try {
			
			conexao = ConexaoBD.getConexao();

				int tpvId=1;
			while(tpvId<=21) {
			PreparedStatement sql1 = conexao.prepareStatement("INSERT INTO ocorrencias(oco_tpv_id,oco_mun_id,oco_ano,oco_mes,oco_total) VALUES(?,?,?,?,?)");
			//21 tipos de veículos diferentes;
			sql1.setLong(1,tpvId);
			sql1.setLong(2,idmunicipio);
			sql1.setLong(3,ano);
			sql1.setLong(4,mes);
			if(tpvId==1) {
				sql1.setLong(5,automovel);
			}else if(tpvId==2) {
				sql1.setLong(5,bonde);
			}else if(tpvId==3) {
				sql1.setLong(5,caminhao);
			}else if(tpvId==4) {
				sql1.setLong(5,caminhaotrator);
			}else if(tpvId==5) {
				sql1.setLong(5,caminhonete);
			}else if(tpvId==6) {
				sql1.setLong(5,camioneta);
			}else if(tpvId==7) {
				sql1.setLong(5,ciclomotor);
			}else if(tpvId==8) {
				sql1.setLong(5,microonibus);
			}else if(tpvId==9) {
				sql1.setLong(5,motocicleta);
			}else if(tpvId==10) {
				sql1.setLong(5,motoneta);
			}else if(tpvId==11) {
				sql1.setLong(5,onibus);
			}else if(tpvId==12) {
				sql1.setLong(5,quadriciclo);
			}else if(tpvId==13) {
				sql1.setLong(5,reboque);
			}else if(tpvId==14) {
				sql1.setLong(5,seimreboque);
			}else if(tpvId==15) {
				sql1.setLong(5,sidecar);
			}else if(tpvId==16) {
				sql1.setLong(5,outros);
			}else if(tpvId==17) {
				sql1.setLong(5,tratoresteira);
			}else if(tpvId==18) {
				sql1.setLong(5,tratorrodas);
			}else if(tpvId==19) {
				sql1.setLong(5,triciclo);
			}else if(tpvId==20) {
				sql1.setLong(5,utilitario);
			}else if(tpvId==21) {
				sql1.setLong(5,chassisplataforma);
			}
			sql1.execute();
			//subiu um id
			tpvId++;
	
		}
		//saiu do while
			idmunicipio++;
			//pegou o proximo municipio
		} finally {
			conexao.close();
		}
	}
	
	
}
	

