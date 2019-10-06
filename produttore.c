#include <stdio.h>
#include <stdlib.h>
#include <stdlib.h>
#include <fcntl.h>
#include <unistd.h>
#include <string.h>


#define MAXDIM 255

char *file_out;

int main(int argc, char **argv){
    int fd_out,written;
    char riga[MAXDIM];
    
    if(argc!=2){
        printf("Errore nel passaggio degli argomenti al file!\n");
        exit(0);
    }

    file_out=argv[1];
    fd_out = open(file_out, O_WRONLY|O_CREAT|O_TRUNC, 00640);
    if(fd_out<0){
        perror("Impossibile creare o aprire il file!\n");
        exit(0);
    }

    gets(riga);
    while(riga != EOF){
        riga[strlen(riga)]='\0';
        written=write(fd_out,riga,strlen(riga));
        if(written<0){
            perror("Impossibile scrivere nel file indicato!\n");
            exit(0);
        }
        gets(riga);
    }
    close(fd_out);
    
    

}
