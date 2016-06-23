FROM microsoft/dotnet:1.0.0-rc2-core

RUN mkdir -p /app/IO.Swagger
COPY . /app/IO.Swagger
WORKDIR /app/IO.Swagger
RUN ["dnu", "restore"]
RUN ["dnu", "pack", "--out", "artifacts"]

EXPOSE 5000/tcp
ENTRYPOINT ["dnx", "-p", "project.json", "web"]
