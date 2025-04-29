.class public final synthetic Lw5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls6/b;


# instance fields
.field public final synthetic a:Lw5/f;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lw5/f;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw5/d;->a:Lw5/f;

    iput-object p2, p0, Lw5/d;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lw5/d;->a:Lw5/f;

    iget-object v1, p0, Lw5/d;->b:Landroid/content/Context;

    invoke-static {v0, v1}, Lw5/f;->b(Lw5/f;Landroid/content/Context;)Lt6/a;

    move-result-object v0

    return-object v0
.end method
