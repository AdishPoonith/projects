.class public final synthetic Lw1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lw1/h$f;

.field public final synthetic k:Ls1/n1;


# direct methods
.method public synthetic constructor <init>(Lw1/h$f;Ls1/n1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw1/j;->j:Lw1/h$f;

    iput-object p2, p0, Lw1/j;->k:Ls1/n1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lw1/j;->j:Lw1/h$f;

    iget-object v1, p0, Lw1/j;->k:Ls1/n1;

    invoke-static {v0, v1}, Lw1/h$f;->c(Lw1/h$f;Ls1/n1;)V

    return-void
.end method
