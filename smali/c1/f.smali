.class public final synthetic Lc1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lc1/g;


# direct methods
.method public synthetic constructor <init>(Lc1/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc1/f;->j:Lc1/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lc1/f;->j:Lc1/g;

    invoke-static {v0}, Lc1/g;->a(Lc1/g;)V

    return-void
.end method
