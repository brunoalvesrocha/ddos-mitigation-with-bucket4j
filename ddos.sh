#!/bin/sh
for i in `seq 1 5000`; do curl --connect-timeout 0 --max-time 0 --keepalive-time 60000 http://localhost:8079/api/someservice/verylazy; done