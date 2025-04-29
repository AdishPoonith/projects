.class Lu5/n$a;
.super Ljava/lang/ThreadLocal;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu5/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ThreadLocal<",
        "Ljavax/crypto/Mac;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lu5/n;


# direct methods
.method constructor <init>(Lu5/n;)V
    .locals 0

    iput-object p1, p0, Lu5/n$a;->a:Lu5/n;

    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    return-void
.end method


# virtual methods
.method protected a()Ljavax/crypto/Mac;
    .locals 2

    :try_start_0
    sget-object v0, Lu5/i;->f:Lu5/i;

    iget-object v1, p0, Lu5/n$a;->a:Lu5/n;

    invoke-static {v1}, Lu5/n;->b(Lu5/n;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lu5/i;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljavax/crypto/Mac;

    iget-object v1, p0, Lu5/n$a;->a:Lu5/n;

    invoke-static {v1}, Lu5/n;->c(Lu5/n;)Ljava/security/Key;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method protected bridge synthetic initialValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lu5/n$a;->a()Ljavax/crypto/Mac;

    move-result-object v0

    return-object v0
.end method
