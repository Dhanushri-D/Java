import java.util.Scanner;
class Songs{
    String Song_name;
    Float Song_len;
    public Songs(){}
    public Songs(String sname,Float slen){
        this.Song_name=sname;
        this.Song_len=slen;
    }
    public String getName(){
        return Song_name;
    }
    public void setName(){
        this.Song_name=Song_name;
    }

    public Float getLen(){
        return Song_len;
    }
    public void setLen(){
        this.Song_len=Song_len;
    }
    public String toString(){
        return "Song [ Song Name = " +Song_name+" Song Length = "+Song_len+"]";
    }
}
class PlayList{
    String pl_name;
    Integer no_songs;
    public PlayList(String pname,Integer no_songs){
        this.pl_name=pname;
        this.no_songs=no_songs;
    }
    public String getPName(){
        return pl_name;
    }
    public void setPName(){
        this.pl_name=pl_name;
    }

    public Integer getNp(){
        return no_songs;
    }
    public void setNp(){
        this.no_songs=no_songs;
    }
    public String toString(){
        return "PlayList [ Playlist Name = " +pl_name+" No of Song in Playlist = "+no_songs+"]";
    }
}
class UserMain{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ssize;
        System.out.print("Enter no of songs : ");
        ssize=Integer.parseInt(sc.nextLine());
        Songs [] arr=new Songs[ssize];
        String song_name;
        Float song_len;
        Songs s;
        for(int i=0;i<ssize;i++){
            System.out.println("Enter the "+(i+1)+" Song data:");
            System.out.print("Song name : ");
            song_name = sc.nextLine();
            System.out.print("Song length: ");
            song_len = Float.parseFloat(sc.nextLine());
            s=new Songs(song_name,song_len);
            arr[i]=s;
        }
        for(Songs i : arr){
            System.out.println(i);
        }
        System.out.println();
        int psize;
        System.out.print("Enter no of playlist : ");
        psize=Integer.parseInt(sc.nextLine());
        PlayList[] parr=new PlayList[psize];
        String p_name;
        Integer no_plSongs;
        PlayList pl;
        Integer PlayListSum=0;
        for(int i=0;i<psize;i++){
            System.out.println("Enter the "+(i+1)+" playlist details:");
            System.out.print("Playlist name : ");
            p_name = sc.nextLine();
            System.out.print("Number of Song in "+p_name+" : ");
            no_plSongs = Integer.parseInt(sc.nextLine());
            PlayListSum = PlayListSum + no_plSongs;
            pl=new PlayList(p_name,no_plSongs);
            parr[i]=pl;
        } 
        for(PlayList i : parr){
            System.out.println(i);
        }       
        if(PlayListSum>ssize){
            System.out.println("Playlist exceeds no of songs given");
        }
        else{
            System.out.println("Executed successfully");
        }
    }
}