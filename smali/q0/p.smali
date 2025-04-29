.class public final synthetic Lq0/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Landroid/content/Context;

.field public final synthetic k:Lq0/r;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lq0/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq0/p;->j:Landroid/content/Context;

    iput-object p2, p0, Lq0/p;->k:Lq0/r;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lq0/p;->j:Landroid/content/Context;

    iget-object v1, p0, Lq0/p;->k:Lq0/r;

    invoke-static {v0, v1}, Lq0/r$a;->b(Landroid/content/Context;Lq0/r;)V

    return-void
.end method
