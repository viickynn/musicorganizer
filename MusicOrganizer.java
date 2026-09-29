import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 7.0
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
        
    }
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    public void checkIndex(int para) //question1
    {
        if((para>=0)&&(para<=files.size()-1))
        {
            System.out.println("");
        }
        else
        {
            System.out.println("Valid range is 0 to size()-1");
        }
    }
    public boolean validIndex(int para) //question2
    {
        if((para>=0)&&(para<=files.size()-1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }  
    public void listFile(int index) //question3
    {
        if(true) 
        {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    public void removeFile(int index)
    {
        if(true) 
        {
            files.remove(index);
        }
    }
    //question4: public void listAllFiles(int index)
    //question5: until the final index/file size
    public void listAllFiles(int index) //question6
    {
        
    }
}        
    

    
