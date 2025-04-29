.class public final synthetic Lp0/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Landroid/content/Context;

.field public final synthetic k:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp0/b0;->j:Landroid/content/Context;

    iput-object p2, p0, Lp0/b0;->k:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lp0/b0;->j:Landroid/content/Context;

    iget-object v1, p0, Lp0/b0;->k:Ljava/lang/String;

    invoke-static {v0, v1}, Lp0/f0;->f(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method
