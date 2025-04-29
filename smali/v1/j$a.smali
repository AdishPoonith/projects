.class Lv1/j$a;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv1/j;-><init>([Lv1/g;[Lv1/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic j:Lv1/j;


# direct methods
.method constructor <init>(Lv1/j;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lv1/j$a;->j:Lv1/j;

    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lv1/j$a;->j:Lv1/j;

    invoke-static {v0}, Lv1/j;->f(Lv1/j;)V

    return-void
.end method
