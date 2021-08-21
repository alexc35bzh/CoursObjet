package homeshop;
// Interface permettant d'écrire dans un fichier
public interface Writer {
	public void start();
	public void writeLine(String line);
	public void stop();
}
