.class public final synthetic Lf1/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Landroid/content/Context;

.field public final synthetic l:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/p;->j:Ljava/lang/String;

    iput-object p2, p0, Lf1/p;->k:Landroid/content/Context;

    iput-object p3, p0, Lf1/p;->l:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lf1/p;->j:Ljava/lang/String;

    iget-object v1, p0, Lf1/p;->k:Landroid/content/Context;

    iget-object v2, p0, Lf1/p;->l:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lf1/q;->b(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method
