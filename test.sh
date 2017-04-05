#Get the active region
REGION=`aws configure get region`
echo $REGION
#Get list of IAM used
IAM_USER=`aws iam list-users`
echo $IAM_USER
#List content of S3(Storage)
S3_CONT=`aws s3 ls`
echo $S3_CONT
