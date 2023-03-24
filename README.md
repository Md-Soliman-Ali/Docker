Install Docker Desktop on Windows
---------------------------------
``
https://docs.docker.com/desktop/install/windows-install
``

Docker Basic Commands (Command Prompt)
--------------------------------------
``
docker version
``
``
docker -v
``
``
docker info
``
``
docker --help
``
``
docker login
``

Docker Images Commands (Command Prompt)
---------------------------------------
``
docker images
``
``
docker pull (Ex. docker pull ubuntu)
``
``
docker rmi (Ex. docker rmi IMAGE ID)
``

Docker Containers Commands (Command Prompt)
-------------------------------------------
``
docker ps
``
``
docker run (Ex. docker run ubuntu -> docker run -it ubuntu)
``
``
docker stop (Ex. docker stop CONTAINER ID)
``
``
docker start (Ex. docker start CONTAINER ID)
``

Docker System Commands (Command Prompt)
---------------------------------------
``
docker stats
``
``
docker system df
``
``
docker system prune -f
``

---------------------------------------
-  docker pull selenium/standalone-chrome:latest
-  docker images
-  docker run -d -p 4444:4444 --shm-size="2g" selenium/standalone-chrome:latest
-  docker ps

Docker with Selenium Grid (Project Dir)
---------------------------------------
- docker-compose -f docker-compose.yml up
- docker-compose -f docker-compose.yml up --scale chrome=2
- docker images
- docker ps
- docker-compose down
