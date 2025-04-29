.class public final Lo6/e$b;
.super Lcom/google/protobuf/z$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo6/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/z$a<",
        "Lo6/e;",
        "Lo6/e$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lo6/e;->e0()Lo6/e;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/z$a;-><init>(Lcom/google/protobuf/z;)V

    return-void
.end method

.method synthetic constructor <init>(Lo6/e$a;)V
    .locals 0

    invoke-direct {p0}, Lo6/e$b;-><init>()V

    return-void
.end method


# virtual methods
.method public H(Ld7/c0;)Lo6/e$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Lo6/e;

    invoke-static {v0, p1}, Lo6/e;->g0(Lo6/e;Ld7/c0;)V

    return-object p0
.end method

.method public I(Ld7/c0;)Lo6/e$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Lo6/e;

    invoke-static {v0, p1}, Lo6/e;->h0(Lo6/e;Ld7/c0;)V

    return-object p0
.end method

.method public J(I)Lo6/e$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Lo6/e;

    invoke-static {v0, p1}, Lo6/e;->f0(Lo6/e;I)V

    return-object p0
.end method

.method public K(Lcom/google/protobuf/t1;)Lo6/e$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Lo6/e;

    invoke-static {v0, p1}, Lo6/e;->i0(Lo6/e;Lcom/google/protobuf/t1;)V

    return-object p0
.end method
