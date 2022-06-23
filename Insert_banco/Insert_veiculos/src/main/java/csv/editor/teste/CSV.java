package csv.editor.teste;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class CSV {

	public static void printRapidoCSV() throws IOException, SQLException{
		List<Veiculo> veiculos = new ArrayList<>();
		BufferedReader br1= null;
		Path pathToFile = Paths.get("C:\\Users\\ViniciusCJ\\Downloads\\municipio_tipo (3).csv");
		br1= Files.newBufferedReader(pathToFile,StandardCharsets.US_ASCII);
		int i=0;
		  String line = br1.readLine();
		  //quantidade a ser inserida
		while(i <100) {
        	    String[] attributes = line.split(";");
        	    Veiculo veiculo= criarVeiculo(attributes);
        	    veiculos.add(veiculo);
        	    line = br1.readLine();
        	    i++;
		}

		for(Veiculo vei:veiculos) {
			System.out.println(vei.toString());
			vei.salvarMunicipios();
		}
		for(Veiculo vei:veiculos) {
			vei.salvarOcorrencias();
		}
        }
       
	
	private static Veiculo criarVeiculo(String[] metadata) {
		String municipio = metadata[0];
		int id = Integer.parseInt(metadata[1]);
		int ano = Integer.parseInt(metadata[2]);
		int mes = Integer.parseInt(metadata[3]);
		int  automovel= Integer.parseInt(metadata[4]);
		int  bonde= Integer.parseInt(metadata[5]);
		int  caminhao= Integer.parseInt(metadata[6]);
		int  caminhaotrator= Integer.parseInt(metadata[7]);
		int  caminhonete= Integer.parseInt(metadata[8]);
		int  camioneta= Integer.parseInt(metadata[9]);
		int  chassisplataforma= Integer.parseInt(metadata[10]);
		int  ciclomotor= Integer.parseInt(metadata[11]);
		int  microonibus= Integer.parseInt(metadata[12]);
		int  motocicleta= Integer.parseInt(metadata[13]);
		int  motoneta= Integer.parseInt(metadata[14]);
		int  onibus= Integer.parseInt(metadata[15]);
		int  quadriciclo= Integer.parseInt(metadata[16]);
		int  reboque= Integer.parseInt(metadata[17]);
		int  seimreboque= Integer.parseInt(metadata[18]);
		int  sidecar= Integer.parseInt(metadata[19]);
		int  outros= Integer.parseInt(metadata[20]);
		int  tratoresteira= Integer.parseInt(metadata[21]);
		int  tratorrodas= Integer.parseInt(metadata[22]);
		int  triciclo= Integer.parseInt(metadata[23]);
		int  utilitario= Integer.parseInt(metadata[24]);
		String estado1="AC";
		 if(municipio.contains(estado1)) {
			 int estadoAC =1;
			 return new Veiculo(municipio,id,ano,mes,automovel,bonde,caminhao,caminhaotrator,caminhonete,camioneta,chassisplataforma,ciclomotor,microonibus,motocicleta
					 ,motoneta,onibus,quadriciclo,reboque,seimreboque,sidecar,outros,tratoresteira,tratorrodas,triciclo,utilitario,estadoAC); 
 	    }
		 
		 String estado2="AL";
		 if(municipio.contains(estado2)) {
			  int estadoAL=2;
			  return new Veiculo(municipio,id,ano,mes,automovel,bonde,caminhao,caminhaotrator,caminhonete,camioneta,chassisplataforma,ciclomotor,microonibus,motocicleta
						 ,motoneta,onibus,quadriciclo,reboque,seimreboque,sidecar,outros,tratoresteira,tratorrodas,triciclo,utilitario,estadoAL); 
		 }
		 String estado3="AP";
		 if(municipio.contains(estado3)) {
			  int estadoAP=3;
			  return new Veiculo(municipio,id,ano,mes,automovel,bonde,caminhao,caminhaotrator,caminhonete,camioneta,chassisplataforma,ciclomotor,microonibus,motocicleta
						 ,motoneta,onibus,quadriciclo,reboque,seimreboque,sidecar,outros,tratoresteira,tratorrodas,triciclo,utilitario,estadoAP);  
 	    } 
		 
		String estado4="AM";
		 if(municipio.contains(estado4)) {
			  int estadoAM=4;
			  return new Veiculo(municipio,id,ano,mes,automovel,bonde,caminhao,caminhaotrator,caminhonete,camioneta,chassisplataforma,ciclomotor,microonibus,motocicleta
						 ,motoneta,onibus,quadriciclo,reboque,seimreboque,sidecar,outros,tratoresteira,tratorrodas,triciclo,utilitario,estadoAM);  
 	    } 
		 
		 String estado5="BA";
		 if(municipio.contains(estado5)) {
			  int estadoBA=5;
			  return new Veiculo(municipio,id,ano,mes,automovel,bonde,caminhao,caminhaotrator,caminhonete,camioneta,chassisplataforma,ciclomotor,microonibus,motocicleta
						 ,motoneta,onibus,quadriciclo,reboque,seimreboque,sidecar,outros,tratoresteira,tratorrodas,triciclo,utilitario,estadoBA);  
 	    } 
		 
		 String estado6="CE";
		 if(municipio.contains(estado6)) {
			  int estadoCE=6;
			  return new Veiculo(municipio,id,ano,mes,automovel,bonde,caminhao,caminhaotrator,caminhonete,camioneta,chassisplataforma,ciclomotor,microonibus,motocicleta
						 ,motoneta,onibus,quadriciclo,reboque,seimreboque,sidecar,outros,tratoresteira,tratorrodas,triciclo,utilitario,estadoCE);  
 	    } 
		 
		 
		 String estado7="ES";
		 if(municipio.contains(estado7)) {
			  int estadoES=7;
			  return new Veiculo(municipio,id,ano,mes,automovel,bonde,caminhao,caminhaotrator,caminhonete,camioneta,chassisplataforma,ciclomotor,microonibus,motocicleta
						 ,motoneta,onibus,quadriciclo,reboque,seimreboque,sidecar,outros,tratoresteira,tratorrodas,triciclo,utilitario,estadoES);  
 	    } 
		 
		 String estado8="GO";
		 if(municipio.contains(estado8)) {
			  int estadoGO=8;
			  return new Veiculo(municipio,id,ano,mes,automovel,bonde,caminhao,caminhaotrator,caminhonete,camioneta,chassisplataforma,ciclomotor,microonibus,motocicleta
						 ,motoneta,onibus,quadriciclo,reboque,seimreboque,sidecar,outros,tratoresteira,tratorrodas,triciclo,utilitario,estadoGO);  
 	    } 
		 
		 String estado9="MA";
		 if(municipio.contains(estado9)) {
			  int estadoMA=9;
			  return new Veiculo(municipio,id,ano,mes,automovel,bonde,caminhao,caminhaotrator,caminhonete,camioneta,chassisplataforma,ciclomotor,microonibus,motocicleta
						 ,motoneta,onibus,quadriciclo,reboque,seimreboque,sidecar,outros,tratoresteira,tratorrodas,triciclo,utilitario,estadoMA);  
 	    }  
		 
		 String estado10="MT";
		 if(municipio.contains(estado10)) {
			  int estadoMT=10;
			  return new Veiculo(municipio,id,ano,mes,automovel,bonde,caminhao,caminhaotrator,caminhonete,camioneta,chassisplataforma,ciclomotor,microonibus,motocicleta
						 ,motoneta,onibus,quadriciclo,reboque,seimreboque,sidecar,outros,tratoresteira,tratorrodas,triciclo,utilitario,estadoMT);  
 	    }  
		return new Veiculo(municipio,id,ano); 
		} 
}

