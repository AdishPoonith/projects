.class public final Ld7/i$b;
.super Lcom/google/protobuf/z$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld7/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/z$a<",
        "Ld7/i;",
        "Ld7/i$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Ld7/i;->e0()Ld7/i;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/z$a;-><init>(Lcom/google/protobuf/z;)V

    return-void
.end method

.method synthetic constructor <init>(Ld7/i$a;)V
    .locals 0

    invoke-direct {p0}, Ld7/i$b;-><init>()V

    return-void
.end method


# virtual methods
.method public H(Ljava/util/Map;)Ld7/i$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ld7/b0;",
            ">;)",
            "Ld7/i$b;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/i;

    invoke-static {v0}, Ld7/i;->g0(Ld7/i;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object p0
.end method

.method public I(Ljava/lang/String;)Ld7/i$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/i;

    invoke-static {v0, p1}, Ld7/i;->f0(Ld7/i;Ljava/lang/String;)V

    return-object p0
.end method

.method public J(Lcom/google/protobuf/t1;)Ld7/i$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/i;

    invoke-static {v0, p1}, Ld7/i;->h0(Ld7/i;Lcom/google/protobuf/t1;)V

    return-object p0
.end method
