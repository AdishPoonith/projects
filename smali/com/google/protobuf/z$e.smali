.class public Lcom/google/protobuf/z$e;
.super Lcom/google/protobuf/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ContainingType::",
        "Lcom/google/protobuf/v0;",
        "Type:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/protobuf/o<",
        "TContainingType;TType;>;"
    }
.end annotation


# instance fields
.field final a:Lcom/google/protobuf/v0;

.field final b:Lcom/google/protobuf/z$d;


# virtual methods
.method public a()Lcom/google/protobuf/b2$b;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/z$e;->b:Lcom/google/protobuf/z$d;

    invoke-virtual {v0}, Lcom/google/protobuf/z$d;->d()Lcom/google/protobuf/b2$b;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/google/protobuf/v0;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/z$e;->a:Lcom/google/protobuf/v0;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/z$e;->b:Lcom/google/protobuf/z$d;

    invoke-virtual {v0}, Lcom/google/protobuf/z$d;->a()I

    move-result v0

    return v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/z$e;->b:Lcom/google/protobuf/z$d;

    iget-boolean v0, v0, Lcom/google/protobuf/z$d;->m:Z

    return v0
.end method
