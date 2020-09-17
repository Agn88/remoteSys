package br.ind.rosseti.remoteSys.communication;
import java.text.DecimalFormat;
import java.time.Instant;

import Moka7.S7;
import Moka7.S7Client;
import br.ind.rosseti.remoteSys.entities.Machine;
import br.ind.rosseti.remoteSys.entities.MachineDetail;

public class ConnectionCLP {

	// If MakeAllTests = true, also DBWrite and Run/Stop tests will be performed
    private static final boolean MakeAllTests = true;
   
    private static long Elapsed;
    private static byte[] Buffer = new byte[65536]; // 64K buffer (maximum for S7400 systems)
    private static final S7Client Client = new S7Client();
    private static int ok=0;
    private static int ko=0;    
    private static String IpAddress = "192.168.20.76";
    private static int Rack = 0; 
    private static int Slot = 1;
    private static int DB = 4; // Sample DB that must be present in the CPU
    private static int DataToMove; // Data size to read/write
    private static int CurrentStatus = S7.S7CpuStatusUnknown;
    
    
    public MachineDetail Connect(Machine machine)
    {
    	
    	Client.SetConnectionType(S7.OP);
    	int res = Client.ConnectTo(machine.getIp(), Rack, Slot);
    	if (res==0)
    	{
    		
    		DecimalFormat df = new DecimalFormat("#####0.0");
    		
    		//Faz leitura de tag
            byte[] data = new byte[16];
            res = Client.ReadArea(S7.S7AreaDB, 4, 0, 16, data); //I want to read DB1.DBD0 (it is a real)
    		
            if (res == 0) {
            	
            	MachineDetail machineDetail = new MachineDetail();
            	
            	machineDetail.setVar01(S7.GetFloatAt(data, 0));
            	machineDetail.setVar02(S7.GetFloatAt(data, 0));
            	machineDetail.setVar03(S7.GetFloatAt(data, 0));
            	machineDetail.setVar04(S7.GetFloatAt(data, 0));
            	machineDetail.setVar05(S7.GetFloatAt(data, 0));
            	machineDetail.setVar06(S7.GetFloatAt(data, 0));
            	machineDetail.setVar07(S7.GetFloatAt(data, 0));
            	machineDetail.setVar08(S7.GetFloatAt(data, 0));
            	machineDetail.setVar09(S7.GetFloatAt(data, 0));
            	machineDetail.setVar10(S7.GetFloatAt(data, 0));
            	machineDetail.setVar11(S7.GetFloatAt(data, 0));
            	machineDetail.setVar12(S7.GetFloatAt(data, 0));
            	machineDetail.setVar13(S7.GetFloatAt(data, 0));
            	machineDetail.setDateContents(Instant.now());
            	machineDetail.setMachine(machine);
            	
                System.out.println("Query successfully executed: " + machine.getName() + " - " + machine.getIp());
                
                Thread.interrupted();
                Client.Disconnect();
                
                return machineDetail;

            }
           
    	}
    	return null;
    }
    
    
    /*
    public static void main(String[] args) throws IOException{
    	if (Connect())
    	{
            System.out.println("foi");
    	}else {
    		System.out.println("Erro");
    	}
    	
    }
    */
    
}
