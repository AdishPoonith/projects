.class public final Lc7/a$b;
.super Lcom/google/protobuf/z$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/z$a<",
        "Lc7/a;",
        "Lc7/a$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lc7/a;->e0()Lc7/a;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/z$a;-><init>(Lcom/google/protobuf/z;)V

    return-void
.end method

.method synthetic constructor <init>(Lc7/a$a;)V
    .locals 0

    invoke-direct {p0}, Lc7/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public H(Lc7/a$c;)Lc7/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Lc7/a;

    invoke-static {v0, p1}, Lc7/a;->h0(Lc7/a;Lc7/a$c;)V

    return-object p0
.end method

.method public I(Ljava/lang/String;)Lc7/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Lc7/a;

    invoke-static {v0, p1}, Lc7/a;->f0(Lc7/a;Ljava/lang/String;)V

    return-object p0
.end method

.method public J(Ld7/x;)Lc7/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Lc7/a;

    invoke-static {v0, p1}, Lc7/a;->g0(Lc7/a;Ld7/x;)V

    return-object p0
.end method
