# Jenkins job 'jobdsl-seedrepo' - a Seed Job

## Function: Auto-populating Jenkins with pipeline jobs

- pipeline jobs are defined in *.groovy files
- Jenkinsfile include all *.groovy files going to be created as pipeline jobs
- when this seed job is run, it will create 'pl-20725-php-new' and others (*.groovy) pipeline jobs

## Note:
After the first time running the Seed Job,
you will see "ERROR: script not yet approved for use"

Do:-
```
	Dashboard / manage jenkins / security / In-process Script Approval / approve the script

    then run job second time will create pipeline jobs
```
## Ref:  [Jenkins Configuration as Code Blog]
```
https://github.com/m-goos/jenkins-configuration-as-code-blog
Blog 2
```

