.class public final synthetic Lr3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lr3/d;


# direct methods
.method public synthetic constructor <init>(Lr3/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr3/c;->j:Lr3/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lr3/c;->j:Lr3/d;

    invoke-static {v0}, Lr3/d;->a(Lr3/d;)V

    return-void
.end method
