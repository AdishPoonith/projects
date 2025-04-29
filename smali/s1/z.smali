.class public final synthetic Ls1/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ls1/x0;

.field public final synthetic k:Ls1/j1$e;


# direct methods
.method public synthetic constructor <init>(Ls1/x0;Ls1/j1$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/z;->j:Ls1/x0;

    iput-object p2, p0, Ls1/z;->k:Ls1/j1$e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ls1/z;->j:Ls1/x0;

    iget-object v1, p0, Ls1/z;->k:Ls1/j1$e;

    invoke-static {v0, v1}, Ls1/x0;->k0(Ls1/x0;Ls1/j1$e;)V

    return-void
.end method
