.class Lcom/google/firebase/storage/u$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/storage/u;->e0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/firebase/storage/u;


# direct methods
.method constructor <init>(Lcom/google/firebase/storage/u;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/storage/u$a;->a:Lcom/google/firebase/storage/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/io/InputStream;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/storage/u$a;->a:Lcom/google/firebase/storage/u;

    invoke-static {v0}, Lcom/google/firebase/storage/u;->l0(Lcom/google/firebase/storage/u;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/firebase/storage/u$a;->a()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method
