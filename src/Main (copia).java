import java.util.Scanner;
import java.util.ArrayList;
//import java.io.File;
//import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main{
	public static void main(String[] args) {

		ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();
		try{

			
			FileInputStream fis = new FileInputStream("distribuidores.txt");
			InputStreamReader isr = new InputStreamReader(fis, "UTF8");
			BufferedReader br = new BufferedReader(isr);

			String linea = br.readLine();
			String [] campos = null;


			while(linea != null){

				Distribuidor distribuidor = new Distribuidor();
				Direccion direccion = new Direccion();
				Contacto contacto = new Contacto();

				campos = linea.split("#");
				
				String distri = campos[0];
				String [] campos2 = distri.split(",");
				distribuidor.setNombre(campos2[0]);
				distribuidor.setCif(campos2[1]);
                //direccion 
				distri = campos[1];
				campos2 = distri.split(",");
				direccion.setCiudad(campos2[0]);
				int entero = Integer.parseInt(campos2[1]);
				direccion.setCodigoPostal(entero);
				direccion.setCalle(campos2[2]);
				entero = Integer.parseInt(campos2[3]);
				direccion.setNumero(entero);
	
				distribuidor.setDireccion(direccion);
				//contacto
				distri = campos[2];
				campos2 = distri.split(",");
				contacto.setNombre(campos2[0]);
				contacto.setApellido(campos2[1]);
				entero = Integer.parseInt(campos2[2]);
				contacto.setNumTelefonico(entero);
				entero = Integer.parseInt(campos2[3]);
				contacto.setEdad(entero);

				distribuidor.setPersonaContacto(contacto);

				distribuidores.add(distribuidor);
				linea = br.readLine();

			}

			for (int i=0;i<distribuidores.size() ;i++ ) {
				
			Direccion direc = new Direccion();
			Contacto contact = new Contacto();
			
			System.out.println("\nProveedor nº: " + (i + 1));
			System.out.println("<><><><><><><><><><><><><><><><><><><><>");
			System.out.println("Nombre: " + (distribuidores.get(i).getNombre()));
			System.out.println("Cif: " + (distribuidores.get(i).getCif()));
			
			direc = distribuidores.get(i).getDireccion();
			System.out.println("\tCiudad: " + direc.getCiudad());
			System.out.println("\tCod.postal: " + direc.getCodigoPostal());
			System.out.println("\tCalle: " + direc.getCalle());
			System.out.println("\tCalle: " + direc.getNumero());
			
			contact = distribuidores.get(i).getPersonaContacto();
			System.out.println("\tNombre: " + contact.getNombre());
			System.out.println("\tApellido: " + contact.getApellido());
			System.out.println("\tnumero telefonico: " + contact.getNumTelefonico());
			System.out.println("\tedad: " + contact.getEdad());

			}

		}catch(Exception ioe) {
			System.out.println("aqui hay un error: "+ioe);
		}
				
						//lechugas


		ArrayList<Lechuga> lechugas = new ArrayList<Lechuga>();
		Scanner sc = new Scanner(System.in);
		System.out.println("\n¿Cuantas lechugas quieres insertar?: ");
		int opcion = sc.nextInt();
	//crear
		for(int o = 0; o < opcion; o++) {
			Lechuga lechuga = new Lechuga();
			System.out.println("\nTipo de lechuga: ");
			lechuga.setTipoLechuga(sc.next());
			System.out.println("Procedencia de la lechuga: ");
			lechuga.setProcedencia(sc.next());
			System.out.println("Color: ");
			lechuga.setColor(sc.next());
			System.out.println("€/Uni: ");
			lechuga.setEurosKilo(sc.nextDouble());
			System.out.println("Nombre del distribuidor: ");
			Distribuidor distribuidor = new Distribuidor();
			distribuidor.setNombre(sc.next());
			for(int d = 0; d < distribuidores.size(); d++) {
				if((distribuidores.get(d).getNombre()).equalsIgnoreCase(distribuidor.getNombre())) {
					lechuga.setDistribuidor(distribuidores.get(d));
				}
			}
			lechugas.add(lechuga);
		}
	//mostrar
		System.out.println("\nLas Lechugas: \n");

		for(int m = 0; m < lechugas.size(); m++) {
			System.out.println("Lechuga nº" + (m + 1));
			System.out.println("<><><><><><><><><><><><><><><><><><><><>");
			System.out.println("Tipo de lechuga: "+(lechugas.get(m).getTipoLechuga()));
			System.out.println("Prcedencia: "+(lechugas.get(m).getProcedencia()));
			System.out.println("Color: "+(lechugas.get(m).getColor()));
			System.out.println("€/Kg: "+(lechugas.get(m).getEurosKilo()));
			Distribuidor distribuidor = lechugas.get(m).getDistribuidor();
			System.out.println("Distribuidor: ");
			System.out.println("\tNombre: "+distribuidor.getNombre());
			System.out.println("\tCIF: "+distribuidor.getCif());
			//contacto
			System.out.println("\t\tNombre: "+(distribuidor.getPersonaContacto()).getNombre());
			System.out.println("\t\tApellido: "+(distribuidor.getPersonaContacto()).getApellido());
			System.out.println("\t\tTelefono: "+(distribuidor.getPersonaContacto()).getNumTelefonico());
			//direccion
			System.out.println("\t\tCiudad: "+(distribuidor.getDireccion()).getCiudad());
			System.out.println("\t\tCódigo postal: "+(distribuidor.getDireccion()).getCodigoPostal());
			System.out.println("\t\tCalle: "+(distribuidor.getDireccion()).getCalle());
			System.out.println("\t\tNumero: "+(distribuidor.getDireccion()).getNumero());
		
		}  		

							//manzanas


		ArrayList<Manzana> manzanas = new ArrayList<Manzana>();
	
		System.out.println("\n¿Cuantas manzanas quieres insertar?: ");
		opcion = sc.nextInt();
	
		for(int m = 0; m < opcion; m++) {
			
			Manzana manzana = new Manzana ();
			System.out.println("\nTipo de manzana: ");
			manzana.setTipoManzana(sc.next());
			System.out.println("Procedencia de la manzana: ");
			manzana.setProcedencia(sc.next());
			System.out.println("Color: ");
			manzana.setColor(sc.next());
			System.out.println("€/Uni: ");
			manzana.setEurosKilo(sc.nextDouble());
			System.out.println("Nombre del distribuidor: ");
			Distribuidor distribuidor = new Distribuidor();
			distribuidor.setNombre(sc.next());
			for(int d = 0; d < distribuidores.size(); d++) {
				if((distribuidores.get(d).getNombre()).equalsIgnoreCase(distribuidor.getNombre())) {
					manzana.setDistribuidor(distribuidores.get(d));
				}
			}
			manzanas.add(manzana);
		}
		
		System.out.println("\nLas Lechugas: \n");

		for(int m = 0; m < manzanas.size(); m++) {
			System.out.println("manzana nº" + (m + 1));
			System.out.println("<><><><><><><><><><><><><><><><><><><><>");
			System.out.println("Tipo de manzana: "+(manzanas.get(m).getTipoManzana()));
			System.out.println("Prcedencia: "+(manzanas.get(m).getProcedencia()));
			System.out.println("Color: "+(manzanas.get(m).getColor()));
			System.out.println("€/Kg: "+(manzanas.get(m).getEurosKilo()));
			Distribuidor distribuidor = manzanas.get(m).getDistribuidor();
			System.out.println("Distribuidor: ");
			System.out.println("\tNombre: "+distribuidor.getNombre());
			System.out.println("\tCIF: "+distribuidor.getCif());
			//contacto
			System.out.println("\t\tNombre: "+(distribuidor.getPersonaContacto()).getNombre());
			System.out.println("\t\tApellido: "+(distribuidor.getPersonaContacto()).getApellido());
			System.out.println("\t\tTelefono: "+(distribuidor.getPersonaContacto()).getNumTelefonico());
			//direccion
			System.out.println("\t\tCiudad: "+(distribuidor.getDireccion()).getCiudad());
			System.out.println("\t\tCódigo postal: "+(distribuidor.getDireccion()).getCodigoPostal());
			System.out.println("\t\tCalle: "+(distribuidor.getDireccion()).getCalle());
			System.out.println("\t\tNumero: "+(distribuidor.getDireccion()).getNumero());
		
		}  		

							//leches


		ArrayList<Leche> leches = new ArrayList<Leche>();
	
		System.out.println("\n¿Cuantas leches quieres insertar?: ");
		opcion = sc.nextInt();
	
		for(int l = 0; l < opcion; l++) {
			
			Leche leche = new Leche();
			System.out.println("\nTipo de leche: ");
			leche.setTipo(sc.next());
			System.out.println("Procedencia de la leche: ");
			leche.setProcedencia(sc.next());
			System.out.println("€/litrs: ");
			leche.setEurosLitro(sc.nextDouble());
			System.out.println("Nombre del distribuidor: ");
			Distribuidor distribuidor = new Distribuidor();
			distribuidor.setNombre(sc.next());
			for(int d = 0; d < distribuidores.size(); d++) {
				if((distribuidores.get(d).getNombre()).equalsIgnoreCase(distribuidor.getNombre())) {
					leche.setDistribuidor(distribuidores.get(d));
				}
			}
			leches.add(leche);
		}
		
		System.out.println("\nLas Lechugas: \n");

		for(int m = 0; m < manzanas.size(); m++) {
			System.out.println("leche nº" + (m + 1));
			System.out.println("<><><><><><><><><><><><><><><><><><><><>");
			System.out.println("Tipo de leche: "+(leches.get(m).getTipo()));
			System.out.println("Prcedencia: "+(leches.get(m).getProcedencia()));
			System.out.println("€/litro: "+(leches.get(m).getEurosLitro()));
			Distribuidor distribuidor = leches.get(m).getDistribuidor();
			System.out.println("Distribuidor: ");
			System.out.println("\tNombre: "+distribuidor.getNombre());
			System.out.println("\tCIF: "+distribuidor.getCif());
			//contacto
			System.out.println("\t\tNombre: "+(distribuidor.getPersonaContacto()).getNombre());
			System.out.println("\t\tApellido: "+(distribuidor.getPersonaContacto()).getApellido());
			System.out.println("\t\tTelefono: "+(distribuidor.getPersonaContacto()).getNumTelefonico());
			//direccion
			System.out.println("\t\tCiudad: "+(distribuidor.getDireccion()).getCiudad());
			System.out.println("\t\tCódigo postal: "+(distribuidor.getDireccion()).getCodigoPostal());
			System.out.println("\t\tCalle: "+(distribuidor.getDireccion()).getCalle());
			System.out.println("\t\tNumero: "+(distribuidor.getDireccion()).getNumero());
		
		} 
							//clientes


	}
}