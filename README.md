### Rodando um banco de dados local

Para iniciar um banco de dados local, executar o seguinte comando docker

docker run -d --name stock-prime -e POSTGRES_USER=root	-e POSTGRES_PASSWORD=pass -e POSTGRES_DB=stock-prime -p 5432:5432 postgres:11
