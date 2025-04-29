.class public final Ld7/x$k$a;
.super Lcom/google/protobuf/z$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld7/x$k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/z$a<",
        "Ld7/x$k;",
        "Ld7/x$k$a;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Ld7/x$k;->e0()Ld7/x$k;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/z$a;-><init>(Lcom/google/protobuf/z;)V

    return-void
.end method

.method synthetic constructor <init>(Ld7/x$a;)V
    .locals 0

    invoke-direct {p0}, Ld7/x$k$a;-><init>()V

    return-void
.end method


# virtual methods
.method public H(Ld7/x$g;)Ld7/x$k$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/x$k;

    invoke-static {v0, p1}, Ld7/x$k;->g0(Ld7/x$k;Ld7/x$g;)V

    return-object p0
.end method

.method public I(Ld7/x$k$b;)Ld7/x$k$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/x$k;

    invoke-static {v0, p1}, Ld7/x$k;->f0(Ld7/x$k;Ld7/x$k$b;)V

    return-object p0
.end method
