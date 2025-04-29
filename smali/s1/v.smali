.class public final synthetic Ls1/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb5/t;


# instance fields
.field public final synthetic j:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/v;->j:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ls1/v;->j:Landroid/content/Context;

    invoke-static {v0}, Ls1/s$b;->b(Landroid/content/Context;)Ls1/p3;

    move-result-object v0

    return-object v0
.end method
