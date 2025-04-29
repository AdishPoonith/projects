.class public final synthetic Ls1/o2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ls1/t2$a;

.field public final synthetic k:Landroid/util/Pair;

.field public final synthetic l:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Ls1/t2$a;Landroid/util/Pair;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/o2;->j:Ls1/t2$a;

    iput-object p2, p0, Ls1/o2;->k:Landroid/util/Pair;

    iput-object p3, p0, Ls1/o2;->l:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ls1/o2;->j:Ls1/t2$a;

    iget-object v1, p0, Ls1/o2;->k:Landroid/util/Pair;

    iget-object v2, p0, Ls1/o2;->l:Ljava/lang/Exception;

    invoke-static {v0, v1, v2}, Ls1/t2$a;->F(Ls1/t2$a;Landroid/util/Pair;Ljava/lang/Exception;)V

    return-void
.end method
