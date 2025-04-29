.class Lcom/google/firebase/storage/a0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/storage/a0;->U()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic j:Ly6/e;

.field final synthetic k:Lcom/google/firebase/storage/a0;


# direct methods
.method constructor <init>(Lcom/google/firebase/storage/a0;Ly6/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/storage/a0$a;->k:Lcom/google/firebase/storage/a0;

    iput-object p2, p0, Lcom/google/firebase/storage/a0$a;->j:Ly6/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/google/firebase/storage/a0$a;->j:Ly6/e;

    iget-object v1, p0, Lcom/google/firebase/storage/a0$a;->k:Lcom/google/firebase/storage/a0;

    invoke-static {v1}, Lcom/google/firebase/storage/a0;->l0(Lcom/google/firebase/storage/a0;)La6/b;

    move-result-object v1

    invoke-static {v1}, Lx6/i;->c(La6/b;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/storage/a0$a;->k:Lcom/google/firebase/storage/a0;

    invoke-static {v2}, Lcom/google/firebase/storage/a0;->m0(Lcom/google/firebase/storage/a0;)Lz5/b;

    move-result-object v2

    invoke-static {v2}, Lx6/i;->b(Lz5/b;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/storage/a0$a;->k:Lcom/google/firebase/storage/a0;

    invoke-static {v3}, Lcom/google/firebase/storage/a0;->n0(Lcom/google/firebase/storage/a0;)Lcom/google/firebase/storage/l;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/firebase/storage/l;->k()Lw5/f;

    move-result-object v3

    invoke-virtual {v3}, Lw5/f;->m()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Ly6/e;->C(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    return-void
.end method
