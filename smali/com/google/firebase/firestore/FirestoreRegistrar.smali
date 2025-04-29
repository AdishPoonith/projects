.class public Lcom/google/firebase/firestore/FirestoreRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-fst"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lb6/e;)Lcom/google/firebase/firestore/b0;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/firestore/FirestoreRegistrar;->lambda$getComponents$0(Lb6/e;)Lcom/google/firebase/firestore/b0;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Lb6/e;)Lcom/google/firebase/firestore/b0;
    .locals 9

    new-instance v6, Lcom/google/firebase/firestore/b0;

    const-class v0, Landroid/content/Context;

    invoke-interface {p0, v0}, Lb6/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    const-class v0, Lw5/f;

    invoke-interface {p0, v0}, Lb6/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lw5/f;

    const-class v0, La6/b;

    invoke-interface {p0, v0}, Lb6/e;->i(Ljava/lang/Class;)Ls6/a;

    move-result-object v3

    const-class v0, Lz5/b;

    invoke-interface {p0, v0}, Lb6/e;->i(Ljava/lang/Class;)Ls6/a;

    move-result-object v4

    new-instance v5, Lp6/q;

    const-class v0, Lv6/i;

    invoke-interface {p0, v0}, Lb6/e;->g(Ljava/lang/Class;)Ls6/b;

    move-result-object v0

    const-class v7, Lr6/j;

    invoke-interface {p0, v7}, Lb6/e;->g(Ljava/lang/Class;)Ls6/b;

    move-result-object v7

    const-class v8, Lw5/n;

    invoke-interface {p0, v8}, Lb6/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lw5/n;

    invoke-direct {v5, v0, v7, p0}, Lp6/q;-><init>(Ls6/b;Ls6/b;Lw5/n;)V

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/google/firebase/firestore/b0;-><init>(Landroid/content/Context;Lw5/f;Ls6/a;Ls6/a;Lp6/g0;)V

    return-object v6
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 4
    .annotation build Landroidx/annotation/Keep;
    .end annotation

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

    const-class v1, Lcom/google/firebase/firestore/b0;

    invoke-static {v1}, Lb6/c;->e(Ljava/lang/Class;)Lb6/c$b;

    move-result-object v1

    const-string v2, "fire-fst"

    invoke-virtual {v1, v2}, Lb6/c$b;->f(Ljava/lang/String;)Lb6/c$b;

    move-result-object v1

    const-class v3, Lw5/f;

    invoke-static {v3}, Lb6/r;->k(Ljava/lang/Class;)Lb6/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb6/c$b;->b(Lb6/r;)Lb6/c$b;

    move-result-object v1

    const-class v3, Landroid/content/Context;

    invoke-static {v3}, Lb6/r;->k(Ljava/lang/Class;)Lb6/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb6/c$b;->b(Lb6/r;)Lb6/c$b;

    move-result-object v1

    const-class v3, Lr6/j;

    invoke-static {v3}, Lb6/r;->i(Ljava/lang/Class;)Lb6/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb6/c$b;->b(Lb6/r;)Lb6/c$b;

    move-result-object v1

    const-class v3, Lv6/i;

    invoke-static {v3}, Lb6/r;->i(Ljava/lang/Class;)Lb6/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb6/c$b;->b(Lb6/r;)Lb6/c$b;

    move-result-object v1

    const-class v3, La6/b;

    invoke-static {v3}, Lb6/r;->a(Ljava/lang/Class;)Lb6/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb6/c$b;->b(Lb6/r;)Lb6/c$b;

    move-result-object v1

    const-class v3, Lz5/b;

    invoke-static {v3}, Lb6/r;->a(Ljava/lang/Class;)Lb6/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb6/c$b;->b(Lb6/r;)Lb6/c$b;

    move-result-object v1

    const-class v3, Lw5/n;

    invoke-static {v3}, Lb6/r;->h(Ljava/lang/Class;)Lb6/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb6/c$b;->b(Lb6/r;)Lb6/c$b;

    move-result-object v1

    sget-object v3, Lcom/google/firebase/firestore/c0;->a:Lcom/google/firebase/firestore/c0;

    invoke-virtual {v1, v3}, Lb6/c$b;->d(Lb6/h;)Lb6/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lb6/c$b;->c()Lb6/c;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v0, v3

    const-string v1, "24.6.0"

    invoke-static {v2, v1}, Lv6/h;->b(Ljava/lang/String;Ljava/lang/String;)Lb6/c;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
