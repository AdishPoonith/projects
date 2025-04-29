.class public final synthetic Ls1/h2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ls1/t2$a;

.field public final synthetic k:Landroid/util/Pair;


# direct methods
.method public synthetic constructor <init>(Ls1/t2$a;Landroid/util/Pair;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/h2;->j:Ls1/t2$a;

    iput-object p2, p0, Ls1/h2;->k:Landroid/util/Pair;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ls1/h2;->j:Ls1/t2$a;

    iget-object v1, p0, Ls1/h2;->k:Landroid/util/Pair;

    invoke-static {v0, v1}, Ls1/t2$a;->i(Ls1/t2$a;Landroid/util/Pair;)V

    return-void
.end method
