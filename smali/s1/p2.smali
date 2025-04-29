.class public final synthetic Ls1/p2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ls1/t2$a;

.field public final synthetic k:Landroid/util/Pair;

.field public final synthetic l:Lu2/n;

.field public final synthetic m:Lu2/q;


# direct methods
.method public synthetic constructor <init>(Ls1/t2$a;Landroid/util/Pair;Lu2/n;Lu2/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/p2;->j:Ls1/t2$a;

    iput-object p2, p0, Ls1/p2;->k:Landroid/util/Pair;

    iput-object p3, p0, Ls1/p2;->l:Lu2/n;

    iput-object p4, p0, Ls1/p2;->m:Lu2/q;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Ls1/p2;->j:Ls1/t2$a;

    iget-object v1, p0, Ls1/p2;->k:Landroid/util/Pair;

    iget-object v2, p0, Ls1/p2;->l:Lu2/n;

    iget-object v3, p0, Ls1/p2;->m:Lu2/q;

    invoke-static {v0, v1, v2, v3}, Ls1/t2$a;->d(Ls1/t2$a;Landroid/util/Pair;Lu2/n;Lu2/q;)V

    return-void
.end method
