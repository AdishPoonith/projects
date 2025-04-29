.class public final synthetic La1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Landroid/content/Context;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La1/a;->j:Landroid/content/Context;

    iput-object p2, p0, La1/a;->k:Ljava/lang/String;

    iput-object p3, p0, La1/a;->l:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, La1/a;->j:Landroid/content/Context;

    iget-object v1, p0, La1/a;->k:Ljava/lang/String;

    iget-object v2, p0, La1/a;->l:Ljava/lang/String;

    invoke-static {v0, v1, v2}, La1/c;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
