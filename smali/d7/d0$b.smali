.class public final Ld7/d0$b;
.super Lcom/google/protobuf/z$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld7/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/z$a<",
        "Ld7/d0;",
        "Ld7/d0$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Ld7/d0;->e0()Ld7/d0;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/z$a;-><init>(Lcom/google/protobuf/z;)V

    return-void
.end method

.method synthetic constructor <init>(Ld7/d0$a;)V
    .locals 0

    invoke-direct {p0}, Ld7/d0$b;-><init>()V

    return-void
.end method


# virtual methods
.method public H(Ld7/c0;)Ld7/d0$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/d0;

    invoke-static {v0, p1}, Ld7/d0;->h0(Ld7/d0;Ld7/c0;)V

    return-object p0
.end method

.method public I(Ljava/lang/String;)Ld7/d0$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/d0;

    invoke-static {v0, p1}, Ld7/d0;->f0(Ld7/d0;Ljava/lang/String;)V

    return-object p0
.end method

.method public J(Lcom/google/protobuf/i;)Ld7/d0$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/d0;

    invoke-static {v0, p1}, Ld7/d0;->g0(Ld7/d0;Lcom/google/protobuf/i;)V

    return-object p0
.end method
