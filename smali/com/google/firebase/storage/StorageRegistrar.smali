.class public Lcom/google/firebase/storage/StorageRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-gcs"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lb6/e;)Lcom/google/firebase/storage/e;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/storage/StorageRegistrar;->lambda$getComponents$0(Lb6/e;)Lcom/google/firebase/storage/e;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Lb6/e;)Lcom/google/firebase/storage/e;
    .locals 4

    new-instance v0, Lcom/google/firebase/storage/e;

    const-class v1, Lw5/f;

    invoke-interface {p0, v1}, Lb6/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw5/f;

    const-class v2, La6/b;

    invoke-interface {p0, v2}, Lb6/e;->g(Ljava/lang/Class;)Ls6/b;

    move-result-object v2

    const-class v3, Lz5/b;

    invoke-interface {p0, v3}, Lb6/e;->g(Ljava/lang/Class;)Ls6/b;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lcom/google/firebase/storage/e;-><init>(Lw5/f;Ls6/b;Ls6/b;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lb6/c<",
            "*>;>;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Lb6/c;

    const-class v1, Lcom/google/firebase/storage/e;

    invoke-static {v1}, Lb6/c;->e(Ljava/lang/Class;)Lb6/c$b;

    move-result-object v1

    const-string v2, "fire-gcs"

    invoke-virtual {v1, v2}, Lb6/c$b;->f(Ljava/lang/String;)Lb6/c$b;

    move-result-object v1

    const-class v3, Lw5/f;

    invoke-static {v3}, Lb6/r;->k(Ljava/lang/Class;)Lb6/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb6/c$b;->b(Lb6/r;)Lb6/c$b;

    move-result-object v1

    const-class v3, La6/b;

    invoke-static {v3}, Lb6/r;->i(Ljava/lang/Class;)Lb6/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb6/c$b;->b(Lb6/r;)Lb6/c$b;

    move-result-object v1

    const-class v3, Lz5/b;

    invoke-static {v3}, Lb6/r;->i(Ljava/lang/Class;)Lb6/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb6/c$b;->b(Lb6/r;)Lb6/c$b;

    move-result-object v1

    sget-object v3, Lw6/e;->a:Lw6/e;

    invoke-virtual {v1, v3}, Lb6/c$b;->d(Lb6/h;)Lb6/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lb6/c$b;->c()Lb6/c;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v0, v3

    const-string v1, "20.2.0"

    invoke-static {v2, v1}, Lv6/h;->b(Ljava/lang/String;Ljava/lang/String;)Lb6/c;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
