.class public final Lo6/a$b;
.super Lcom/google/protobuf/z$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/z$a<",
        "Lo6/a;",
        "Lo6/a$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lo6/a;->e0()Lo6/a;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/z$a;-><init>(Lcom/google/protobuf/z;)V

    return-void
.end method

.method synthetic constructor <init>(Lo6/a$a;)V
    .locals 0

    invoke-direct {p0}, Lo6/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public H(Ld7/i;)Lo6/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Lo6/a;

    invoke-static {v0, p1}, Lo6/a;->h0(Lo6/a;Ld7/i;)V

    return-object p0
.end method

.method public I(Z)Lo6/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Lo6/a;

    invoke-static {v0, p1}, Lo6/a;->f0(Lo6/a;Z)V

    return-object p0
.end method

.method public J(Lo6/b;)Lo6/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Lo6/a;

    invoke-static {v0, p1}, Lo6/a;->g0(Lo6/a;Lo6/b;)V

    return-object p0
.end method

.method public K(Lo6/d;)Lo6/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Lo6/a;

    invoke-static {v0, p1}, Lo6/a;->i0(Lo6/a;Lo6/d;)V

    return-object p0
.end method
