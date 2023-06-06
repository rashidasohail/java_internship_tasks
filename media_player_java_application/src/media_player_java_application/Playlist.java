/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media_player_java_application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Rashda Khanzada
 */
public class Playlist {
    
    JFileChooser myfile=new JFileChooser();
    ArrayList list=new ArrayList();
    FileInputStream fis;
    ObjectInputStream ois;
    FileOutputStream fos;
    ObjectOutputStream oos;
    //select the songs to be add in the playlist
    void add(JFrame frame) throws IOException{
        myfile.setMultiSelectionEnabled(true);
        int fileValid=myfile.showOpenDialog(frame);
        if(fileValid==javax.swing.JFileChooser.CANCEL_OPTION){
           return;
        }
        else if(fileValid==javax.swing.JFileChooser.APPROVE_OPTION){
        File[] file=myfile.getSelectedFiles();  
        list.addAll(Arrays.asList(file));
        
        }
     }  
    
    //set the songs
    public void openPls(JFrame frame){
        myfile.setMultiSelectionEnabled(false);
        int Valid = myfile.showOpenDialog(frame);
        if (Valid == javax.swing.JFileChooser.CANCEL_OPTION){
            return;
        }
        if (Valid == javax.swing.JFileChooser.APPROVE_OPTION){
            File pls = myfile.getSelectedFile();
            try{
                fis = new FileInputStream(pls);
                ois = new ObjectInputStream(fis);
                File tmp;
                while ((tmp = (File) ois.readObject()) != null){
                    list.add(tmp);
                }
              if ((tmp = (File) ois.readObject()) == null){
                  list.isEmpty();
              }
              ois.close();
            }catch (Exception e){
        }
        
        }
    }
    
    //get the playlist
    ArrayList getListSong(){
        return list;
    }
    
    //save the song to the playist
    public void saveAsPlaylist(JFrame frame){
        myfile.setMultiSelectionEnabled(true);
        int Valid=myfile.showOpenDialog(frame);
        if(Valid==javax.swing.JFileChooser.CANCEL_OPTION){
              return;
        } 
        else if(Valid==javax.swing.JFileChooser.APPROVE_OPTION){
        File[] playlst=myfile.getSelectedFiles();
        try{
            fos=new FileOutputStream(playlst + ".tgr");
            oos=new ObjectOutputStream(fos);
            for (int i=0; i<list.size() ; i++){
                    File tmp = (File) list.get(i);
                    oos.writeObject(tmp);
            }
            oos.close();
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
        }
        }
    }
    
}
