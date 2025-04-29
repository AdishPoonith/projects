.class public final synthetic Lp0/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lp0/n0$a;

.field public final synthetic k:Lp0/y0;


# direct methods
.method public synthetic constructor <init>(Lp0/n0$a;Lp0/y0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp0/x0;->j:Lp0/n0$a;

    iput-object p2, p0, Lp0/x0;->k:Lp0/y0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lp0/x0;->j:Lp0/n0$a;

    iget-object v1, p0, Lp0/x0;->k:Lp0/y0;

    invoke-static {v0, v1}, Lp0/y0;->b(Lp0/n0$a;Lp0/y0;)V

    return-void
.end method
