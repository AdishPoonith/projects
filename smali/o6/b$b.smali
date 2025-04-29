.class public final Lo6/b$b;
.super Lcom/google/protobuf/z$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/z$a<",
        "Lo6/b;",
        "Lo6/b$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lo6/b;->e0()Lo6/b;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/z$a;-><init>(Lcom/google/protobuf/z;)V

    return-void
.end method

.method synthetic constructor <init>(Lo6/b$a;)V
    .locals 0

    invoke-direct {p0}, Lo6/b$b;-><init>()V

    return-void
.end method


# virtual methods
.method public H(Ljava/lang/String;)Lo6/b$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Lo6/b;

    invoke-static {v0, p1}, Lo6/b;->f0(Lo6/b;Ljava/lang/String;)V

    return-object p0
.end method

.method public I(Lcom/google/protobuf/t1;)Lo6/b$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Lo6/b;

    invoke-static {v0, p1}, Lo6/b;->g0(Lo6/b;Lcom/google/protobuf/t1;)V

    return-object p0
.end method
